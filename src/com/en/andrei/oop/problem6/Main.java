package com.en.andrei.oop.problem6;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by atpop on 05 Apr 2021
 */

public class Main {

    public static void main(String[] args) {


        Produs p1 = new Produs(1, "Ciocolata", 15.55);
        Produs p2 = new Produs(1, "Faina", 5.12);
        Produs p3 = new Produs(3, "Ulei", 7.50);
        Produs p4 = new Produs(17, "Zahar", 3.25);
        Set<Produs> myProducts = new HashSet<>();
        myProducts.add(p1);
        myProducts.add(p2);
        myProducts.add(p3);
        myProducts.add(p4);
        myProducts.add(p1);
        System.out.println(myProducts.size());
        myProducts.remove(p3);
        boolean isProduct = myProducts.contains(p3);
        System.out.println(isProduct);
        for (Produs p : myProducts) {
            System.out.println(p);
        }
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

    }
}
