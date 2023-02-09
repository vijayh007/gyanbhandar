package JavaBaiscs.advance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(30, "Vijay", "Hm", "Bangalore");
        Employee e2 = new Employee(35, "Raj", "Kumar", "Chennai");
        Employee e3 = new Employee(33, "Mark", "abc", "ghar");
        Employee e4 = new Employee(33, "musk", "aabc","bahar");

        List<Employee> eList = new ArrayList<>();
        eList.add(e1);
        eList.add(e2);
        eList.add(e3);
        eList.add(e4);
        System.out.println(eList);
        Collections.sort(eList);
        System.out.println(eList);
    }
}
