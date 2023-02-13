package problems;

public class MinimumCost {
    public static void main(String[] args) {
        String S = "aaaa";
        int[] C = {3,4,5,6};
        System.out.println(solution(S, C));
    }
    public static int solution(String S, int[] C) {
        int totalCost = 0;
        char PChar = S.charAt(0);
        int maximumCost = C[0];
        int currTotalCost =C[0];
        int length = S.length();
        for (int i = 1; i < length; i++) {
            char c = S.charAt(i);
            int currCost = C[i];
            if (c == PChar) {
                maximumCost = Math.max(maximumCost, currCost);
                currTotalCost += currCost;
            } else {
                totalCost += currTotalCost - maximumCost;
                PChar = c;
                maximumCost = currCost;
                currTotalCost = currCost;
            }
        }
        totalCost += currTotalCost - maximumCost;
        return totalCost;
    }
}
