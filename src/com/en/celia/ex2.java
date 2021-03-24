package com.en.celia;

public class ex2 {
    public static int calculateSum (int a, int b, int c)
    {
        int result = a + b +c ;
        return result;
    }

    public static void main(String[] args) {
        int result = calculateSum(74, 36, 5);
        System.out.println("Suma celor 3 numere este: " + result);
    }
}
