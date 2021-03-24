package com.en.diana;

public class Homework1 {

    //    OPERATORS methods
    public static void getTime(int a) {
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

    public static int sum(int a, int b, int c) {
        int sum = 0;
        return sum = a + b + c;
    }

    public static int prod(int a, int b) {
        int product = 0;
        return product = a * b;
    }

//    IF instruction + IF instruction( level 1) methods

    public static int compare(int a, int b, int c) {
        int no = 0;
        if (a > b && b > c) {
            no = a;
            System.out.println(a);
        } else if (a < b && b < c) {
            no = c;
            System.out.println(c);
        } else if (a > b && b < c) {
            if (a > c) {
                no = a;
                System.out.println(a);
            } else {
                no = c;
                System.out.println(c);
            }
        }else if (a < b && b > c) {
            no = b;
            System.out.println(b);
        }
        return no;
    }

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
        int i = 0;
        while (contor < n) {
            if (i % 2 == 1) {
                System.out.println(i);
                suma = suma + i;
                contor++;
            }
            i++;
        }
        System.out.println("The Sum of odd Natural Number upto " + n + " terms is: " + suma);
        return suma;
    }

    public static void main(String[] args) {

        // OPERATORS
         /*1. Write a Java program to print 'Hello' on screen and then print your name on a
        separate line Expected Output : Hello YourNameHere */
        System.out.println("Exercitiul 1 de la Operators: ");
        String name = "Diana";
        System.out.println("Hello\n" + name);

        /* 2. Write a Java program to print the sum of three numbers.
        Test Data: 74 + 36 + 5
        Expected Output : 115 */
        System.out.println("Exercitiul 2 de la Operators: ");
        System.out.println(sum(74, 36, 5));

       /* 3. Write a Java program to print the result of the following operation:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3 */
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("Exercitiul 3 de la Operators:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        /* 4. Write a Java program that takes two numbers as input and display the product of two numbers
         Test Data: Input first number: 25 Input second number: 5
         Expected Output : 25 x 5 = 125
         */
        System.out.println("Exercitiul 4 de la Operators: ");
        System.out.println(prod(25, 5));

        /*5. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder
        of two numbers*/
        int nr1 = 125;
        int nr2 = 24;
        int sum = nr1 + nr2;
        int multi = nr1 * nr2;
        int subst = nr1 - nr2;
        int divide = nr1 / nr2;
        int reminder = nr1 % nr2;
        System.out.println("Exercitiul 5 de la Operators:");
        System.out.println(nr1 + "+" + nr2 + "=" + sum + "\n" + nr1 + "-" + nr2 + "=" + subst + "\n" +
                nr1 + "*" + nr2 + "=" + multi + "\n" + nr1 + "/" + nr2 + "=" + divide + "\n" + nr1 +
                "mod" + nr2 + "=" + reminder);

        // 7. Write a Java program to swap two variables
        System.out.println("Exercitiul 7 de la Operators:");
        int v, w, z;
        v = 15;
        w = 27;
        System.out.println("Before : v, w = " + v + ", " + w);
        z = v;
        v = w;
        w = z;
        System.out.println("After : v, w = " + v + ", " + w);

        //9. Write a Java program to convert seconds to hour, minute and seconds.
        System.out.println("Exercitiul 9 de la Operators:");

        getTime(86399);

        //11. Write a program that converts into seconds 12 hours, 18 minutes, 48 seconds
        System.out.println("Exercitiul 11 de la Operators: ");
        int calc = convertHours(12, 18, 48);
        System.out.println("Sunt " + calc + " secunde!");

        // IF instruction + IF instruction( level 1)
        /*6. Take three numbers and print the greatest number.
        Test Data Input the 1st number: 25 Input the 2nd number: 78
        Input the 3rd number: 87 */
        System.out.println("Exercitiul 6 de la IF:");
        System.out.println("The greatest: "+compare(25, 78, 87));

        //8. Write a Java program that takes an integer between 1 and 7 and displays the name of the weekday.
        System.out.println("Exercitiul 8 de la IF: ");

        week(3);

         /*12. Given 2 int values, return true if either of them is in the range 10..20 inclusive.
        in1020(12, 99) → true
        in1020(21, 12) → true
        in1020(8, 99) → false  */
        System.out.println("Exercitiul 12 de la IF: ");
        System.out.println(

                range(12, 99));
        System.out.println(

                range(21, 12));
        System.out.println(

                range(8, 99));

        /* 15. Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
        lastDigit(7, 17) → true
        lastDigit(6, 17) → false
        lastDigit(3, 113) → true */
        System.out.println("Exercitiul 15 de la IF: ");
        System.out.println(

                lastDigit(7, 17));
        System.out.println(

                lastDigit(6, 17));
        System.out.println(

                lastDigit(3, 113));

        //FOR/WHILE loops
         /* 3. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5
         and by both */
        System.out.println("Exercitiul 3 de la FOR/WHILE: ");
        System.out.println("\nDivided by 3: ");
        for (
                int i = 1;
                i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        System.out.println("\nDivided by 5: ");
        for (
                int i = 1;
                i < 100; i++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }

        System.out.println("\nDivided by 3 & 5: ");
        for (
                int i = 1;
                i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.print(i + ", ");
        }

        // 4. Write a program in Java to display the first 10 natural numbers.
        System.out.println("\nExercitiul 4 de la FOR/WHILE:");
        for (
                int i = 1;
                i <= 10; i++) {
            System.out.println(i);
        }

        // 5. Write a program in Java to display the n terms of odd natural number and their sum.
        System.out.println("Exercitiul 5 de la FOR/WHILE");
        System.out.println(

                oddNumbers(5));
    }
}


