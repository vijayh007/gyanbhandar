package tenDays.javahashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7};
        int[] arr1 = {1,5,4,8};
        System.out.println(unionArray(arr, arr1));
    }
    public static int unionArray(int[] arr, int[] arr1){
        Set<Integer> set = new HashSet<>();
        for (int i : arr){
            set.add(i);
        }
        for (int i : arr1){
            set.add(i);
        }
        return set.size();
    }
}
