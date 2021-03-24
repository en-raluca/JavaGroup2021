package com.en.cristian;

public class FirstHomework {

/**
 * 1.Write a Java program to print 'Hello' on screen and then print your name on a separate line
 * */
public static void printName(String name){
    System.out.println("Hello" + name);
}

/**
 2.Write a Java program to print the sum of three numbers.
 */
public static int calclulateSumOfThreeNumbers(int a, int b, int c) {
    int sum = a + b + c;
    return sum;
}

    /**
     3.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
     */
    public static void calculateOperation(int a, int b) {
        int sum = a + b;
        System.out.println("Suma este = " + sum);
        int dif = a - b;
        System.out.println("Diferenta este = " + dif);
        int prod = a * b;
        System.out.println("Produsul este = " + prod);
        int divide = a / b;
        System.out.println("Impartirea este = " + divide);
        int modulo = a % b;
        System.out.println("Modulo este = " + modulo);
    }

    /**
     11.Write a program that converts into seconds 12 hours, 18 minutes, 48 seconds
     */
    //public static int convertIntoSecond(int hour, int minute, int second){
   // }

    /**
     1.Write a program in Java to check if a number is even or odd in Java.
     A number is called even if it is completely divisible by 2 and odd if it’s not completely divisible by 2.
     */
    public static void checkIfNumberIsEvenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("numarul este par!");
        }else {
            System.out.println("Numarul este impar!");
        }
    }

    public static void main(String[] args) {
        printName("Cristian");

        int suma = calclulateSumOfThreeNumbers(74, 36, 5);
        System.out.println("Suma a 3 numere este = " + suma);

        calculateOperation(125, 24);

        checkIfNumberIsEvenOrOdd(8);
        checkIfNumberIsEvenOrOdd(5);
    }
}
