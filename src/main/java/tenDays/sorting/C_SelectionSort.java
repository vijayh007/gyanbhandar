package tenDays.sorting;

import java.util.Arrays;

public class C_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,8,3,9,4,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }


    public static int[] selectionSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            int min = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
         return arr;
    }
}
