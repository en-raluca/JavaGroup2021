package com.en.celia;

public class while1 {
    public static int factorial(int i, int n) {
        int fact = 1;
        while (i <= n) {
            fact = fact * i;
            i++;

        }
        return fact;
    }
        public static void main (String[]args){
            int result = factorial(1, 3);
            System.out.println("Factorialul nr este: " + result);

        }
}
