package com.en.raul;

import java.util.ArrayList;
import java.util.List;

public class Tema1 {
    public static void main(String[] args){
        computeValue(5);
        convertSecondsTo(86399);
        System.out.println("Valoarea in dolari este: "+convertToDollars(5));
        convertIntoSeconds(12,18,48);
        System.out.println("The greatest number is: "+greatestNumber(100,78,50));
        System.out.println("The day of week is: " + dayOfWeek(1));
        System.out.println("The average of these numbers is: " + averageNumber(25,45,65));
        System.out.println("Your grade is: " + studentGrade(50,40,40));
        System.out.println("Your sum is: " + checkSum(2,2));
        checkOddNumber(99);
        System.out.println("Factorial is: " + calculateFactorial(5));
        divisibleNumber(100);
        naturalNumbers(10);
        nTerms(5);
    }

    public static void computeValue(int n){
        System.out.printf("%d + %d%d + %d%d%d\n",n,n,n,n,n,n);
    }

    public static void convertSecondsTo(int totalSeconds){
        int hours = totalSeconds/3600;
        int minutes = (totalSeconds%3600) /60;
        int seconds = totalSeconds % 60;

        System.out.println(hours+":"+minutes+":"+seconds);
    }

    public static double convertToDollars(double amount){
        double dollars = amount / 0.781162;
        return dollars;
    }

    public static void convertIntoSeconds(int hours,int minutes,int seconds){
        int hoursInSeconds = hours * 3600;
        int minutesToSeconds = minutes * 60;
        int totalSeconds= hoursInSeconds+minutesToSeconds+seconds;
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds " + "is " + totalSeconds + " in seconds");
    }

    public static int greatestNumber(int a,int b,int c){
        int result;
        if(a>b && a>c){
            result = a;
        }else if(b>a && b>c){
            result = b;
        }else{
            result = c;
        }
        return result;
    }

    public static int averageNumber(int a,int b,int c){
        int result = (a+b+c)/3;
        return result;
    }

    public static String studentGrade(int quiz,int midTerm,int finalScore){
        String grade="";
        int averageScore = (quiz+midTerm+finalScore) / 3;
        if (averageScore>=90){
            grade="A";
        }else if(averageScore>=70 && averageScore<90){
            grade="B";
        }else if (averageScore>=50 && averageScore<70){
            grade="C";
        }else{
            grade="F";
        }
        return grade;
    }

    public static int checkSum(int a,int b){
        int result;
        if(a!=b){
            result=a+b;
        }else {
            result=(a+b)*2;
        }
        return result;
    }

    public static String dayOfWeek(int n){
        String day="";
        if (n==1){
            day="Monday";
        }else if(n==2){
            day="Tuesday";
        }else if(n==3){
            day="Wednesday";
        }else if(n==4){
            day="Thursday";
        }else if(n==5){
            day="Friday";
        }else if(n==6){
            day="Saturday";
        }else if(n==7){
            day="Sunday";
        }else{
            day="The number is higher that 7 or lower than 1.";
        }
        return day;
    }

    public static void checkOddNumber(int n){
        for(int i=0;i<=n;i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static int calculateFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void divisibleNumber(int n){
        List<Integer> div3 = new ArrayList<>();
        List<Integer> div5 = new ArrayList<>();
        List<Integer> div3and5 = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            if (i % 3 == 0) {
                div3.add(i);
            }
        }
        System.out.println("Numbers that are divided by 3 are: "+ div3);

        for(int j=1;j<=n;j++){
            if(j % 5 == 0) {
                div5.add(j);
            }
        }
        System.out.println("Numbers that are divided by 5 are: "+ div5);

        for(int k=1;k<=n;k++){
            if((k % 3 == 0) && (k % 5 == 0)) {
                div3and5.add(k);
            }
        }
        System.out.println("Numbers that are divided by 3 & 5 are: "+ div3and5);
    }

    public static void naturalNumbers(int n){
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }

    public static void nTerms(int n){
        int sum=0;
        System.out.println("The odd numbers are:");
        for(int i=1;i<=n;i++){
            System.out.println(2*i-1);
            sum+=2*i-1;
        }
        System.out.println("The Sum of odd Natural Number upto " + n +" terms is " + sum);
    }
}
