package com.en.andrei;

import java.util.Arrays;

/**
 * Created by atpop on 25 Mar 2021
 */

public class Exercise2 {

    // ARRAY

    /**
     * 1. Write a Java program to test if 10 appears as either the first or last element of an array of integers.
     * The length of the array must be greater than or equal to 2
     *
     * @param array
     * @return
     */
    public static void checkNumberTenInArray(int[] array) {
        if (array.length < 2) {
            System.out.println("Wrong input!");
        } else if (array[0] == 10 && array[array.length - 1] == 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * 3. Write a program to test that a given array of integers of length 2 contains a 4 or a 7.
     *
     * @param array
     */
    public static boolean checkFourOrSevenInArray(int[] array) {
        boolean result = false;
        if (array.length == 2) {
            System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 4 || array[i] == 7) {
                    result = true;
                }
            }
        } else {
            System.out.println("Wrong input!");
        }
        return result;
    }

    /**
     * 17. Write a Java program to replace the second element of a ArrayList with the specified element.
     *
     * @param array
     * @return
     */
    public static int[] replaceSecondElement(int[] array, int element) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        result[1] = element;
        return result;
    }

    //STRING

    /**
     * 1. Write a Java program to convert a given string into lowercase.
     *
     * @param s
     * @return
     */
    public static String convertToLowerCase(String s) {
        String result = "";
        result = s.toLowerCase();
        return result;
    }

    /**
     * 10) Return true if the given string contains between 1 and 3 'e' chars.
     *
     * @param s
     * @return
     */
    public static boolean stringE(String s) {
        boolean result = false;
        int countE = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                countE++;
            }
        }
        if (countE >= 1 && countE <= 3) {
            result = true;
        }
        return result;
    }

    // STRING(level 1)

    /**
     * 1) Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     * @param name
     * @return
     */
    public static String helloName(String name) {
        String hello = "Hello ";
        String exclamationMark = "!";
        return hello.concat(name) + exclamationMark;
    }

    /**
     * Given two strings, a and b,
     * return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
     * @param a
     * @param b
     * @return
     */
    public static String makeAbba(String a, String b) {
        String result = a + b + b + a;
        return result;
    }

    /**
     * 13) Given a string, return a string length 1 from its front, unless front is false,
     * in which case return a string length 1 from its back. The string will be non-empty.
     * @param text
     * @param check
     * @return
     */
    public static String theEnd(String text, boolean check) {
        String result = "";
        if(check) {
            return result + text.charAt(0);
        } else {
            return result + text.charAt(text.length()-1);
        }
    }


    public static void main(String[] args) {
        int[] myArray = new int[]{10, -20, 0, 30, 40, 60, 10};
//        for(int elem: myArray) {
//            System.out.println(elem);
//        }
//        checkNumberTenInArray(myArray);
        int[] array = new int[]{5, 7};
//        boolean result = checkFourOrSevenInArray(array);
//        System.out.println(result);
//        int[] result = replaceSecondElement(array, 2);
//        for(int e: result) {
//            System.out.println(e);
//        }
//        String test = "Heelele";
//        boolean result = stringE(test);
//        System.out.println(result);
//        String name = "Cristian";
//        String result = helloName(name);
//        System.out.println(result);
//        String result = makeAbba("Hi", "Bye");
//        System.out.println(result);
        String result = theEnd("Hello", true);
        System.out.println(result);
    }
}
