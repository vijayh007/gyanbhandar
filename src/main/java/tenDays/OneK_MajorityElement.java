package tenDays;

public class OneK_MajorityElement {
    public static void main(String[] args) {
        //1. brute-force Technique
        // using two loop without any space, time complexity O(n^2) Space : O(1)

        //2.  Sort the Array and start counting the element if count is n/2 then its answer
        //time complexity : O(nlogn) space : O(1)

        //3. Using Space : we can use HashMap
        // time O(n) space O(n)

        //4. constant space : Moore's Voting Algorithm
            int[] arr = {1,2,2,1,3};
            System.out.println(majorityElement(arr));

    }
    public static int majorityElement(int[] arr){
        int ansIndex = 0;
        int count = 1;
        for(int i = 1; i< arr.length; i++){
            if(arr[i] == arr[ansIndex]){
                count++;
            }else {
                count--;
            }
            if(count == 0){
                ansIndex = i;
                count++;
            }
        }
        //check if ansIndex is actual answer

        int result = arr[ansIndex];
        count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == result){
                count++;
            }
        }
        if(count > arr.length/2){
            return result;
        }else {
            return -1;
        }
    }

}
