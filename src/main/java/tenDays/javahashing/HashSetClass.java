package tenDays.javahashing;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(14);
        set.add(45);
        set.add(59);
        set.add(20);

        System.out.println(set);
        System.out.println(set.contains(12));
        set.remove(45);
        System.out.println(set);
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
