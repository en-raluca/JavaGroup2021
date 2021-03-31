package com.en.andrei.operator;

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

    // IF INSTRUCTION

    /**
     * 1. Write a program in Java to check if a number is even or odd in Java.
     * A number is called even if it is completely divisible by 2 and odd if it’s not completely divisible by 2.
     *
     * @param number
     */
    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    /**
     * 2. Write a Java program to compare two numbers.
     */
    public static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Second first number: ");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " != " + secondNumber);
            System.out.println(firstNumber + " > " + secondNumber);
            System.out.println(firstNumber + " >= " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " != " + secondNumber);
            System.out.println(firstNumber + " < " + secondNumber);
            System.out.println(firstNumber + " <= " + secondNumber);
        } else {
            System.out.println(firstNumber + " = " + secondNumber);
        }
    }

    /**
     * 13: Write a Java program that determines a student’s grade.
     * The program will read three types of scores(quiz, mid-term, and final scores)
     * and determine the grade based on the following rules:
     * -if the average score >=90% =>grade=A
     * -if the average score >= 70% and <90% => grade=B
     * -if the average score>=50% and <70% =>grade=C
     * -if the average score<50% =>grade=F
     *
     * @param quizScore
     * @param midTermScore
     * @param finalScore
     */
    public static void printStudentGrade(int quizScore, int midTermScore, int finalScore) {
        int averageScore = (quizScore + midTermScore + finalScore) / 3;
        System.out.println(averageScore);
        if (averageScore >= 90) {
            System.out.println("Grade A");
        } else if (averageScore >= 70 && averageScore < 90) {
            System.out.println("Grade B");
        } else if (averageScore >= 50 && averageScore < 70) {
            System.out.println("Grade C");
        } else if (averageScore < 50) {
            System.out.println("Grade F");
        } else {
            System.out.println("Invalid input");
        }
    }

    // IF INSTRUCTIONS(level 1)

    /**
     * 3) Given two int values, return their sum. Unless the two values are the same, then return double their sum.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int sumDouble(int num1, int num2) {
        int sum = num1 + num2;
        if (num1 == num2) {
            sum += sum;
        }
        return sum;
    }

    /**
     * 10) We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 2 int values, return true if one or the other is teen, but not both.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static boolean loneTeen(int num1, int num2) {
        boolean isTeen = false;
        if ((num1 >= 13 && num1 <= 19) && (num2 < 13 || num2 > 19)) {
            isTeen = true;
        } else if ((num2 >= 13 && num2 <= 19) && (num1 < 13 || num1 > 19)) {
            isTeen = true;
        }
        return isTeen;
    }

    // FOR/WHILE LOOPS

    /**
     * 1. Write a Java program to calculate factorial of an integer number
     *
     * @param number
     * @return
     */
    public static int calculateFactorialRecursive(int number) {
        if (number == 0) return 1;
        return number * (calculateFactorialRecursive(number - 1));
    }

    /**
     * 4. Write a program in Java to display the first 10 natural numbers.
     */
    public static void printFirstTenNaturalNumbers() {
        System.out.println("The first 10 natural numbers are: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    /**
     * 5. Write a program in Java to display the n terms of odd natural number and their sum.
     */
    public static void displayTermsAndSumOfOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of terms is: ");
        int terms = scanner.nextInt();
        int sum = 0;
        System.out.println("The odd numbers are: ");
        for (int i = 1; i <= terms; i++) {
            System.out.println(i * 2 - 1);
            sum += i * 2 - 1;
        }
        System.out.println("The Sum of odd Natural Number up to " + terms + " terms is: " + sum);
    }

    public static void main(String[] args) {
//        printName("Andrei");
//        printSumOfThreeNumbers(74, 36, 5);
//        printProduct();
//        printOperations();
//        printAreaAndPerimeter(5.6, 8.5);
//        swapTwoVariables(5, 10);
//        computeInteger();
//        convertSeconds(86399);
//        calculateDollarFromEuro(10);
//        convertToSeconds(12, 18, 48);
//        checkEvenOrOdd(10);
//        compareNumbers();
//        printStudentGrade(80, 68, 90);
//        int result = sumDouble(1,2);
//        System.out.println(result);
//        boolean result1 = loneTeen(13, 99);
//        System.out.println(result1);
//        boolean result2 = loneTeen(13, 13);
//        System.out.println(result2);
//        int fact = calculateFactorialRecursive(4);
//        System.out.println(fact);
//        printFirstTenNaturalNumbers();
        displayTermsAndSumOfOddNumbers();
    }
}
