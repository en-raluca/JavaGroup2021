package com.en.andrei;

import java.util.Scanner;

/**
 * Created by atpop on 23 Mar 2021
 */

public class Exercise1 {

    // Operators

    /**
     * 1) Write a Java program to print 'Hello' on screen and then print your name on a separate line
     *
     * @param yourName
     */
    public static void printName(String yourName) {
        System.out.println("Hello " + yourName);
    }

    /**
     * 2) Write a Java program to print the sum of three numbers.
     *
     * @param num1
     * @param num2
     * @param num3
     */
    public static void printSumOfThreeNumbers(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }


    /**
     * 4) Write a Java program that takes two numbers as input and display the product of two numbers
     */
    public static void printProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 * num2;
        System.out.format("%d x %d = %d", num1, num2, sum);
    }

    /**
     * 5) Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
     */

    public static void printOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int multiply = num1 * num2;
        int dif = num1 - num2;
        int divide = num1 / num2;
        int modulo = num1 % num2;
        System.out.format("%d + %d = %d\n", num1, num2, sum);
        System.out.format("%d - %d = %d\n", num1, num2, dif);
        System.out.format("%d x %d = %d\n", num1, num2, multiply);
        System.out.format("%d / %d = %d\n", num1, num2, divide);
        System.out.format("%d mod %d = %d\n", num1, num2, modulo);
    }

    /**
     * 6) Write a Java program to print the area and perimeter of a rectangle
     *
     * @param width
     * @param height
     */
    public static void printAreaAndPerimeter(double width, double height) {
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.format("Area is %.1f * %.1f = %.2f\n", width, height, area);
        System.out.format("Perimeter is 2 * (%.1f + %.1f) = %.2f", width, height, perimeter);
    }

    /**
     * 7) Write a Java program to swap two variables
     *
     * @param val1
     * @param val2
     */
    public static void swapTwoVariables(int val1, int val2) {
        System.out.println("Before swap, Val1 = " + val1);
        System.out.println("Before swap, Val2 = " + val2);
        int aux = val1;
        val1 = val2;
        val2 = aux;
        System.out.println("After swap, Val1 = " + val1);
        System.out.println("After swap, Val2 = " + val2);
    }

    /**
     * 8) Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
     */
    public static void computeInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        System.out.format("%d + %d%d + %d%d%d", n, n, n, n, n, n);
    }

    /**
     * 9) Write a Java program to convert seconds to hour, minute and seconds.
     *
     * @param seconds
     */
    public static void convertSeconds(int seconds) {
        System.out.println("Input seconds: " + seconds);
        int remainingSeconds = seconds % 60;
        int hour = (seconds / 60) / 60;
        int minute = (seconds / 60) % 60;
        System.out.println(hour + ":" + minute + ":" + remainingSeconds);
    }

    /**
     * 10) Write a program that calculates the number of US dollars equivalent to a given number of euros.
     * Assume an exchange rate of 0.781162 per dollar.
     *
     * @param euro
     */
    public static void calculateDollarFromEuro(double euro) {
        double dollar = euro / 0.781162;
        System.out.println(euro + " Euros = " + dollar + " Dollars");
    }

    /**
     * 11) Write a program that converts into seconds 12 hours, 18 minutes, 48 seconds.
     *
     * @param hour
     * @param minute
     * @param second
     */
    public static void convertToSeconds(int hour, int minute, int second) {
        int hoursToSeconds = hour * 3600;
        int minutesToSeconds = minute * 60;
        int result = hoursToSeconds + minutesToSeconds + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        printName("Andrei");
        printSumOfThreeNumbers(74, 36, 5);
        printProduct();
        printOperations();
        printAreaAndPerimeter(5.6, 8.5);
        swapTwoVariables(5, 10);
        computeInteger();
        convertSeconds(86399);
        calculateDollarFromEuro(10);
        convertToSeconds(12, 18, 48);
    }
}
