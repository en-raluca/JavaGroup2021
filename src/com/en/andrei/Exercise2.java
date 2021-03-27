package com.en.andrei;

/**
 * Created by atpop on 25 Mar 2021
 */

public class Exercise2 {

    // ARRAY

    /**
     * 1. Write a Java program to test if 10 appears as either the first or last element of an array of integers.
     * The length of the array must be greater than or equal to 2
     * @param array
     * @return
     */
    public static void checkNumberTenInArray(int[] array) {
        if (array.length < 2) {
            System.out.println("Wrong input!");
        } else if(array[0] == 10 && array[array.length-1] == 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{10, -20, 0, 30, 40, 60, 10};
        for(int elem: myArray) {
            System.out.println(elem);
        }
        checkNumberTenInArray(myArray);
    }
}
