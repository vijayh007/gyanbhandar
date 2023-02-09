package tenDays.javahashing;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 15, -5,10, 20};
        int sum = 5;
        subArraySum(arr, sum);
    }
    public static void subArraySum(int[] arr, int sum){
        Map<Integer, Integer> map = new HashMap<>();
        int currSum =0;
        int start = 0;
        int end =-1;
        for (int i = 0; i< arr.length; i++){
            currSum += arr[i];
            if (currSum-sum == 0){
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(currSum-sum)){
                start = map.get(currSum-sum)+1;
                end = i; break;
            }map.put(currSum, i);
        }
        if (end ==-1){
            System.out.println("sum not found");
        }else {
            System.out.println(start + " " + end);
        }
    }
}
