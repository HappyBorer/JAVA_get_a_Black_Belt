package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee empOne = new Employee(100, "Ivan", "Ivanov" , 45343);
        Employee empTwo = new Employee(20, "Petr", "Sedorov" , 34556);
        Employee empThree = new Employee(50, "Lena", "Words" , 358385);

        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);

        System.out.println("Before sorting\n" + list);
        Collections.sort(list);
        System.out.println("After sorting\n" + list);
    }
}
