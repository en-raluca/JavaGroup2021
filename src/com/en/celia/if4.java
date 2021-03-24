package com.en.celia;

public class if4 {
    public static boolean sum (int a, int b, int c){
        int sum = a + b;
        if (a + b == c){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        boolean result = sum(6, 12, 18);
        System.out.println(result);
    }
}
