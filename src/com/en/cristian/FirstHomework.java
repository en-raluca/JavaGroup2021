package com.en.cristian;

public class FirstHomework {

    /**
     * 1.Write a Java program to print 'Hello' on screen and then print your name on a separate line
     */
    public static void printName(String name) {

        System.out.println("Hello " + name);
    }

    /**
     * 2.Write a Java program to print the sum of three numbers.
     */
    public static int calclulateSumOfThreeNumbers(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    /**
     * 3.Write a Java program to print the result of the following operations
     */
    public static void printTheResult() {
        int a = -5 + 8 * 6;
        System.out.println("a este = " + a);
        int b = (55 + 9) % 9;
        System.out.println("b este = " + b);
        int c = 20 + (-3) * 5 / 8;
        System.out.println("c este = " + c);
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("d este = " + d);

    }

    /**
     * 4.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
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
     * 11.Write a program that converts into seconds 12 hours, 18 minutes, 48 seconds
     */
    public static void convertIntoSecond(int hour, int minute, int second) {
        int hoursToSecond = hour * 3600;
        int minuteToSecond = minute * 60;
        int result = hoursToSecond + minuteToSecond + second;
        System.out.println("Convertirea in secunde este: " + result);
    }

    /**
     * 1.Write a program in Java to check if a number is even or odd in Java.
     * A number is called even if it is completely divisible by 2 and odd if it’s not completely divisible by 2.
     */
    public static void checkIfNumberIsEvenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("numarul este par!");
        } else {
            System.out.println("Numarul este impar!");
        }
    }

    /**
     * 3.Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd
     */
    public static int checkNumberIsEvenOrOdd(int n) {
        if (n % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * 5.Write a Java program to get a number and print whether it is positive or negative.
     */
    public static void findPositiveOrNegativeNumber(int n) {
        if (n > 0) {
            System.out.println("The number is positive!");
        } else if (n < 0) {
            System.out.println("The number is negative!");
        } else {
            System.out.println("The number is zero!");
        }
    }

    /**
     * 6.Take three numbers and print the greatest number.
     */
    public static int printTheGreatestNumber(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    /**
     * 7.Write a Java program that takes an integer m and display the value of n is 1 when m is larger than 0,
     * 0 when m is 0 and -1 when m is less than 0.
     */
    public static int displayValueOfNumber(int m, int n) {
        if (m > 0) {
            return n = 1;
        } else if (m == 0) {
            return n = 0;
        } else {
            return n = -1;
        }
    }

    /**
     * 1.Write a Java program to calculate factorial of an integer number.
     * Calculating Factorial is also a classic recursion exercise in programming. Since factorial is a recursive function,
     * recursion becomes natural choice to solve this problem. You just need to remember formula for calculating factorial
     * which is for n! its n*(n-1)*…1.
     */
    public static int calculateFactorial(int i, int n) {
        int factorial = 1;
        while (i <= n) {
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }

    /**
     * 2.Write a Java program to print the odd numbers from 1 to 99. Prints one number per line
     */
    public static void printTheOddNumber(int n) {
        while (n <= 99) {
            if (n % 2 == 1) {
                System.out.println("Afiseaza numarul: " + n);
            }
            n++;
        }
    }


    public static void main(String[] args) {
        printName("Cristian");

        int suma = calclulateSumOfThreeNumbers(74, 36, 5);
        System.out.println("Suma a 3 numere este = " + suma);

        calculateOperation(125, 24);

        printTheResult();

        convertIntoSecond(12, 18, 48);

        checkIfNumberIsEvenOrOdd(8);
        checkIfNumberIsEvenOrOdd(5);

        int result = checkNumberIsEvenOrOdd(20);
        System.out.println("Rezultatul este: " + result);

        findPositiveOrNegativeNumber(35);

        int greatestNr = printTheGreatestNumber(25, 78, 87);
        System.out.println("Cel mai mare numar este: " + greatestNr);

        int displayNr = displayValueOfNumber(10, 0);
        System.out.println("Numarul afisat este: " + displayNr);

        int factorial = calculateFactorial(1, 7);
        System.out.println("Factorialul Numarului este: " + factorial);

        printTheOddNumber(1);
    }
}
