package tenDays;

//Kaden's algorithm to solve Maximum Sum SubArray
public class OneL_MaximumSumSubarray_KadensAlgo {
    public static void main(String[] args) {
        //1. Brute-Force : Using two loops : Time O(N^2)

        // Kaden's Algorithm
        int[] arr = {5,-4,-2, 6,-1};
        System.out.println(maxSumSubArray(arr));
    }

    public static int maxSumSubArray(int[] arr){
        int maxSum = arr[0];
        int currSum = arr[0];
        for (int i =1; i < arr.length; i++){
            currSum = currSum+arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }if (currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
