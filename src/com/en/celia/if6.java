package com.en.celia;

public class if6 {
    public static void showGreatestNumber (int a, int b, int c){
        if (a>b && a>c){
            System.out.println("A este cel mai mare numar");
        }else if (b>a && b>c){
            System.out.println("B este cel mai mare numar");
        }else{
            System.out.println("C este cel mai mare numar");
        }
    }
    public static void main(String[] args) {

        showGreatestNumber(5,2,10);
    }
}
