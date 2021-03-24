package com.en.celia;

public class if1 {
    public static void even (int n){
        if (n % 2 ==0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {

        even(10);
    }
}
