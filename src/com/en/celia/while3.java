package com.en.celia;

public class while3 {

        public static void div (int n){

            while ((n % 3 == 0 || n%5==0)) {
                if (n <= 100) {
                    System.out.println(n);
                }
                n++;
            }
        }
        public static void main(String[] args) {
           div(1);
        }
}
