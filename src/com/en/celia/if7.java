package com.en.celia;

public class if7 {
    public static int larger (int n, int m){
        if (m>0){
            return n = 1;
        }else if (m==0){
            return n = 0;
        }else {
            return n = -1;
        }
    }
    public static void main(String[] args) {

        int result = larger(0, -6);
        System.out.println(result);
    }
}
