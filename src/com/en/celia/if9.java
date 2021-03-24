package com.en.celia;

public class if9 {
    public static void checkTheNumber (int n){
        if (n>0){
            System.out.println("The number is positive");
        }else if (n == 0){
            System.out.println("The number is zero");
        }else {
            System.out.println("The number in negative");
        }
    }
    public static void main(String[] args) {

        checkTheNumber(-6);
    }
}
