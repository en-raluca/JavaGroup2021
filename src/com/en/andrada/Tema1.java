package com.en.andrada;

public class Tema1 {
    public static void main(String[] args) {
        int num1 = printSumofCombinedNumbers(5);
        convertSecondtoHour(86399);
        eligibleToVote(23);
        boolean result1 = sameDigit(23, 13);
        System.out.println(result1);

        int result2= factorial(5);
        System.out.println(result2);

        oddNumbers();

        divisibleBy3And5();
    }

    //exercitiul 8
    public static int printSumofCombinedNumbers(int i) {
        int sum = i + (i * 11) + (i * 111);
        System.out.println(i + "+" + i + i + "+" + i + i + i + " este " + sum);
        return sum;
    }

    //ex9
    public static void convertSecondtoHour(int seconds) {
        int sec = seconds % 60;
        int h = seconds / 60;
        int min = h % 60;
        h = h / 60;
        System.out.println(h + ":" + min + ":" + sec);
    }

    //exercitiul 12
    public static void eligibleToVote(int age) {
        String s1 = "You are eligibile to vote";
        String s2 = "You are not eligible to vote";
        if (age >= 18) {
            System.out.println(s1);
        } else {
            System.out.println(s2);
        }
    }

    //exercitiul 15 if level1
    public static boolean sameDigit(int num1, int num2) {
        int digitnum1 = num1 % 10;
        int digitnum2 = num2 % 10;
        boolean result = true;
        if (digitnum1 == digitnum2) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //for/while
    public static int factorial(int num){
        int result=1;
        for (int i=2;i<=num;i++) {
            result=result*i;
        }
        return result;
    }
    public static void oddNumbers() {
        for(int i=1;i<=99;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }

    public static void divisibleBy3And5(){
        System.out.println("Divided by 3");
        for (int i=1;i<=100;i++){
            if(i%3==0){
                System.out.print(i+",");
            }
        }
        System.out.println("\nDivided by 5");
        for (int i=1;i<=100;i++){
            if(i%5==0){
                System.out.print(i+",");
            }
        }
        System.out.println("\nDivided by 3 and 5");
        for (int i=1;i<=100;i++){
            if((i%3==0)&(i%5==0)){
                System.out.print(i+",");
            }
        }
    }


}
