package tenDays.sorting;

import java.util.Arrays;

public class D_QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,8,4,6,1,2,5};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int l, int h){
        if(l < h){
            int pivot = partition(arr,l,h);
            quickSort(arr, l, pivot-1);
            quickSort(arr,pivot+1, h);
        }
    }
    public static int partition(int[] arr, int l, int h){
        int pivot = arr[l];
        int i = l;
        int j = h;
        while (i<j){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }
}
