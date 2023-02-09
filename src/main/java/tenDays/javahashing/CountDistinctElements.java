package tenDays.javahashing;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,2,3,5,1,7,6,7};
        System.out.println(countDistinct(arr));
    }
    public static int countDistinct(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int i: arr){
            set.add(i);
        }
        return set.size();
    }
}
