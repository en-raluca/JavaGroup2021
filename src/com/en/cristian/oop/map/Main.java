package com.en.cristian.oop.map;



import com.en.cristian.oop.ObjectManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        ObjectManager manager = new ObjectManager();

        Product prod1 = new Product("lapte", "Lactate", 4.99, 1);
        Product prod2 = new Product("corn", "Patiserie", 3, 4);
        Product prod3 = new Product("zmeura", "Fructe", 10, 5);

        Person pers1 = new Person("Mircea", "Popescu", 20, 2);
        Person pers2 = new Person("Anca", "Popica", 31, 6);
        Person pers3 = new Person("Rita", "Nutescu", 30, 1);

        Order order1 = new Order("1", prod1, pers1);
        Order order2 = new Order("2", prod2, pers2);
        Order order3 = new Order("3", prod3, pers3);
        Order order4 = new Order("4", prod2, pers1);

        Map<String, Order> orderMap = new HashMap<>();
        orderMap.put("1", order1);
        orderMap.put("2", order2);
        orderMap.put("3", order3);
        orderMap.put("4", order4);

        System.out.println("Nr de comenzi este: " + manager.returnOrdersProduct(orderMap, 4));
        System.out.println("Nr de comenzi: " + manager.returnOrdersProduct(orderMap, 1));

        double result = manager.returnSumOrdersOfPerson(orderMap, 2);
        System.out.println("Suma comenzilor este: " + result);

//        List<String> resultList=new ArrayList<>();
//        resultList.add(manager.returnIdsFromOrders(orderMap, 2);
        System.out.println("Id urile comenzilor sunt: " + manager.returnIdsFromOrders(orderMap, 2));
    }
}