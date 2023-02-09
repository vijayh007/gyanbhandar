package tenDays;

public class OneO_RainWaterTrappingProblem {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,0,1,3,2};
        System.out.println(waterTrapping(arr));
    }
    public static int waterTrapping(int[] arr){
        int[] auxLeft = new int[arr.length];
        int[] auxRight = new int[arr.length];
        auxLeft[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            auxLeft[i] = Math.max(arr[i], auxLeft[i-1]);
        }
        auxRight[arr.length-1] = arr[arr.length-1];
        for (int j = arr.length-2; j>=0; j--){
            auxRight[j] = Math.max(arr[j], auxRight[j+1]);
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            result = result + (Math.min(auxRight[i],auxLeft[i]))-arr[i];
        }
        return result;
    }
}
