package problems;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class HalfPollution {
    public static void main(String[] args) {
        int[] arr = {3,0,5};
        System.out.println(solution(arr));
    }
    public static int solution(int[] A) {
        int totalPollution = 0;
        Queue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int pollution : A) {
            pQueue.add(pollution);
            totalPollution = totalPollution + pollution;
        }

        double minimunPollutionLevel = (double) totalPollution / 2;
        int filterRequired = 0;
        while (totalPollution > minimunPollutionLevel) {

            double filteredValue = (double) pQueue.poll() / 2;
            totalPollution = (int) (totalPollution - filteredValue);
            filterRequired++;
            pQueue.add((int) filteredValue);

        }
        return filterRequired;
    }
}
