package com.en.andrei.oop.problem4;

import java.util.*;

/**
 * Created by atpop on 05 Apr 2021
 */

public class Main {

    public static void main(String[] args) {
        Employee em1 = new Employee("1", "Popescu", "Onisifor Ghibu nr. 3");
        Employee em2 = new Employee("2", "Ionescu", "Emil Isac nr. 11");
        Employee em3 = new Employee("3", "Gheorghescu", "Gheorghe Dima nr. 3");

        System.out.println(em1.hashCode());
        System.out.println(em2.hashCode());
        System.out.println(em3.hashCode());

        Set<Employee> mySet = new HashSet<>();
        mySet.add(em1);
        mySet.add(em2);
        mySet.add(em3);
        mySet.add(em1);
        boolean isEmployee = mySet.contains(em1);
        System.out.println(isEmployee);
        for (Employee e : mySet) {
            System.out.println(e);
        }

        Map<String, Employee> myMap = new HashMap<>();
        myMap.put(em1.getEmployeeId(), em1);
        myMap.put(em2.getEmployeeId(), em2);
        boolean isKey = myMap.containsKey(em1.getEmployeeId());
        boolean isValue = myMap.containsValue(em2);
        System.out.println(isKey);
        System.out.println(isValue);
//        myMap.remove(em1.getEmployeeId()); // remove by key is the best option

        Set<String> keySet = myMap.keySet();
        for (String s : keySet) {
            System.out.println("Keys: " + s);
        }
        Collection<Employee> values = myMap.values();

        Iterator<Employee> iterator = values.iterator();
        while (iterator.hasNext()) {
            Employee em = iterator.next();
            System.out.println(em);
        }
    }
}
