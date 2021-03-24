package com.en.celia;

public class ex7 {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int aux;

        aux = a;
        a = b;
        b = aux;

        System.out.println("Var a = " + a);
        System.out.println("Var b = " + b);
    }
}
