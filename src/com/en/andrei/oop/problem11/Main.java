package com.en.andrei.oop.problem11;

/**
 * Created by atpop on 01 Apr 2021
 */

public class Main {

    public static void main(String[] args) {
        Pizza pizzaCuAnsoa = new Pizza("Hawaiana", 'M', 15.5);
        double price = pizzaCuAnsoa.calculatePrice();
        System.out.println(price);
    }
}
