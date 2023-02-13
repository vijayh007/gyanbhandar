package tenDays.sorting;

import java.util.Arrays;

public class B_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,7,5,6,1};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static int[] insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i-1;int temp = arr[i];
             while (j>=0  && arr[j] > temp){
                 arr[j+1] = arr[j];
                 j--;
             }
             arr[j+1] = temp;
        }
        return arr;
    }
}
