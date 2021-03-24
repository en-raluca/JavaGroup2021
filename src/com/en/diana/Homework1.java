package com.en.diana;

public class Homework1 {

    //    OPERATIONS methods
    static public void getTime(int a) {
        System.out.println(a / 3600 + ":" + a / 60 % 60 + ":" + a % 60);
    }

    public static int convertHours(int h, int m, int s) {
        int minutes, seconds, hours;
        hours = h * 1;
        minutes = m * 60;
        seconds = s * 3600;
        int sum = hours + minutes + seconds;
        return sum;
    }

//    IF instruction + IF instruction( level 1) methods

    public static int week(int w) {
        if (w == 1) {
            System.out.println("Monday");
        } else if (w == 2) {
            System.out.println("Tuesday");
        } else if (w == 3) {
            System.out.println("Wednesday");
        } else if (w == 4) {
            System.out.println("Thursday");
        } else if (w == 5) {
            System.out.println("Friday");
        } else if (w == 6) {
            System.out.println("Saturday");
        } else if (w == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Not a day!");
        }
        return 0;
    }

    public static boolean range(int a, int b) {
        boolean compare = false;
        if (a >= 10 && a <= 20 || b >= 10 && b <= 20) {
            compare = true;
        } else {
            compare = false;
        }
        return compare;
    }

    public static boolean lastDigit(int a, int b) {
        boolean mod = false;
        if (a % 10 == b % 10) {
            mod = true;
        } else {
            mod = false;
        }
        return mod;
    }

    //FOR/WHILE loops methods
    public static int oddNumbers(int n) {
        int suma = 0;
        int contor = 0;
        int i=0;
        while (contor < n) {
            if (i % 2 == 1) {
                System.out.println(i);
                suma = suma + i;
                contor++;
            }
            i++;
        }
        System.out.println("The Sum of odd Natural Number upto "+ n +" terms is: " + suma);
        return suma;
    }

    public static void main(String[] args) {

        // OPERATIONS
       /* 3. Write a Java program to print the result of the following operation:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3 */
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("Exercitiul 3 de la Operations:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        //5. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
        int nr1 = 125;
        int nr2 = 24;
        int sum = nr1 + nr2;
        int multi = nr1 * nr2;
        int subst = nr1 - nr2;
        int divide = nr1 / nr2;
        int reminder = nr1 % nr2;
        System.out.println("Exercitiul 5 de la Operations:");
        System.out.println("Rezultatul  pentru sum: " + sum + "," + " rezultatul pentr multiply: " +
                multi + "," + " rezultatul pentru substract: " + subst + "," + "\nrezultatul pentru divide: "
                + divide + "," + " rezultatul pentru remainder: " + reminder);

        //9. Write a Java program to convert seconds to hour, minute and seconds.
        System.out.println("Exercitiul 9 de la Operations:");
        getTime(86399);

        //11. Write a program that converts into seconds 12 hours, 18 minutes, 48 seconds
        System.out.println("Exercitiul 11 de la Operations: ");
        int calc = convertHours(12, 18, 48);
        System.out.println("Sunt " + calc + " secunde!");

        // IF instruction + IF instruction( level 1)
        //8. Write a Java program that takes an integer between 1 and 7 and displays the name of the weekday.
        System.out.println("Exercitiul 8 de la IF: ");
        week(3);

         /*12. Given 2 int values, return true if either of them is in the range 10..20 inclusive.
        in1020(12, 99) → true
        in1020(21, 12) → true
        in1020(8, 99) → false  */
        System.out.println("Exercitiul 12 de la IF: ");
        System.out.println(range(12, 99));
        System.out.println(range(21, 12));
        System.out.println(range(8, 99));

        /* 15. Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
        lastDigit(7, 17) → true
        lastDigit(6, 17) → false
        lastDigit(3, 113) → true */
        System.out.println("Exercitiul 15 de la IF: ");
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));

        //FOR/WHILE loops
         /* 3. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5
         and by both */
        System.out.println("Exercitiul 3 de la FOR/WHILE: ");
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        System.out.println("\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }

        System.out.println("\nDivided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.print(i + ", ");
        }

        // 4. Write a program in Java to display the first 10 natural numbers.
        System.out.println("\nExercitiul 4 de la FOR/WHILE:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 5. Write a program in Java to display the n terms of odd natural number and their sum.
        System.out.println("Exercitiul 5 de la FOR/WHILE");
        System.out.println(oddNumbers(5));

    }
}

