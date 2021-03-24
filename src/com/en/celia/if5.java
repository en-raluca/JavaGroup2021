package com.en.celia;

public class if5 {
    public static int pozitiveOrNegative (int n){
        if (n>0) {
            System.out.println("The number is positive");
        }else if (n==0) {
            System.out.println("The number is 0");
        }else {
            System.out.println("The number is negative");
        }
        return n;
    }

    public static void main(String[] args) {

        int result = pozitiveOrNegative(-3);
        System.out.println(result);
    }
}
