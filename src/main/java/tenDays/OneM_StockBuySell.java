package tenDays;

public class OneM_StockBuySell {
    public static void main(String[] args) {
        //1 . Brute-Force using two loops : Time O(n^2)

        //2. using aux array. find the max from last till element
        //time : O(N) space : O(n)

        //3. using minimum so far and maximumProfit
        //time O(n) space O(1)
        int[] arr = {5,2,6,1,4};
        System.out.println(maxProfit(arr));

    }
    public static int maxProfit(int[] arr){
        int minSoFar = arr[0];
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++){
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
