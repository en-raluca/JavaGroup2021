package com.en.celia;

public class ex5 {
    public static int calculateSum (int a, int b){
        int sum = a + b ;
        return sum;
    }

    public static int calculateDif (int a, int b){
        int dif = a - b ;
        return dif;
    }

    public static int calculateProd (int a, int b){
        int prod = a * b ;
        return prod;
    }

    public static int calculateDiv (int a, int b){
        int divide = a / b ;
        return divide;
    }

    public static int calculateRemainder (int a, int b){
        int remainder = a % b ;
        return remainder;
    }

    public static void main(String[] args) {

        int sum = calculateSum(125, 24);
        int dif = calculateDif(125, 24);
        int prod = calculateProd(125, 24);
        int div = calculateDiv(125, 24);
        int rem = calculateRemainder(125, 24);

        System.out.println("The sum is" + sum);
        System.out.println("The difference is" + dif);
        System.out.println("The multiplication is" + prod);
        System.out.println("The division is" + div);
        System.out.println("The remainder is" + rem);
    }
    }
