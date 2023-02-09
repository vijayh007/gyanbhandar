package tenDays.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,8,6};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length;i++){
            boolean swapped = false;
            for (int j =0; j < arr.length -i-1; j++){
                if(arr[j+1] < arr[j]){
                    swapped = true;
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}

