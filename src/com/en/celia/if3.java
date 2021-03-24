package com.en.celia;

public class if3 {
    public static int even (int n){
        if (n % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        int result = even (10);
        System.out.println(result);
    }
}
