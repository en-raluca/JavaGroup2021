package com.en.andrei.oop.problem10;

import com.en.andrei.oop.ObjectManager;
import com.en.andrei.oop.problem4.Employee;

import java.util.*;

/**
 * Created by atpop on 05 Apr 2021
 */

public class Main {

    public static void main(String[] args) {

        ObjectManager manager = new ObjectManager();

        Product prod1 = new Product(1, "Book", "Books", 25.5);
        Product prod2 = new Product(2, "Chocolate", "Food", 12.5);
        Product prod3 = new Product(3, "Samsung Galaxy S20", "Phone", 1200.5);

        Person person1 = new Person(1,"Popescu", "Ioan", 32);
        Person person2 = new Person("Samartimeanu", "Septimiu", 25);

        Order order1 = new Order("1", prod1, person1);
        Order order2 = new Order("2", prod1, person2);
        Order order3 = new Order("3", prod3, person1);

        Map<String, Order> orderMap = new HashMap<>();
        orderMap.put(order1.getId(), order1);
        orderMap.put(order2.getId(), order2);
        orderMap.put(order3.getId(), order3);

        int nrOfOrders = manager.howManyOrdersForAProduct(orderMap, 1);
        System.out.println("Total number of orders for this product is = " + nrOfOrders);

        double productSum = manager.calculateProductSumFromOrder(orderMap, 1);
        System.out.println("Total sum of product ordered by this customer is = " + productSum);

        Set<Integer> prodId = manager.orderIdPerson(orderMap, 1);
        System.out.println(prodId.toString());

        Map<String, Person> personMap = manager.personIdOrder(orderMap, 1);

        for (String name: personMap.keySet()) {
            String value = personMap.get(name).toString();
            System.out.println(name + " " + value);
        }
    }
}
