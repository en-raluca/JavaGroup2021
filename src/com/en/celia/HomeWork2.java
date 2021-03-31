package com.en.celia;

import javax.swing.*;

public class HomeWork2 {
    /*Write a Java program to test if 10 appears as either the first or last element of an array
    of integers. The length of the array must be greater than or equal to 2
     */
    public static boolean checkFirstAndLastElem (int[] array){
        int firstElem = array[0];
        int lastElem = array[array.length-1];

        if (firstElem == 10 || lastElem == 10) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
    Write a Java program to test if the first and the last element of an array of integers are
same. The length of the array must be greater than or equal to 2.
     */
    public static boolean checkIfFirstAndLastAreSame (int[] array){
        int firstElement = array[0];
        int lastElement = array[array.length-1];

        if (firstElement == lastElement){
            return true;
        }else {
            return false;
        }
    }
    /*
    Write a program to test that a given array of integers of length 2 contains a 4 or a 7.
     */
    public static boolean verify4Or7 (int[] array){
        int elem1 = array[0];
        int elem2 = array[1];

        if (elem1 == 4 || elem1 == 7){
            return true;
        }else if (elem2 == 4 || elem2 == 7){
            return true;
        }else {
            return false;
        }
    }
    /*
    Write a Java program to get the larger value between first and last element of an array
(length 3) of integers .
     */
    public static int largerValue (int[] array){
        int firstElem = array[0];
        int lastElem = array[array.length-1];

        if (firstElem>lastElem){
            return firstElem;
        }else {
            return lastElem;
        }
    }
    /*
    Write a Java program to count the number of even and odd elements in a given array of
integers.
     */
        public static void countEvenOrOdd(int[] array){
        int even = 0;
        int odd = 0;

        for (int i = 0; i<array.length; i++){
            if (array[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
         }
            System.out.println("Elemente pare: " + even);
            System.out.println("Elemente impare: " + odd);
        }
/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The
array will be length 1 or more.
 */
        public static boolean checkIf6Exists (int[] array){
                if (array[0] == 6){
                    return true;
                }else if (array.length-1 == 6){
                    return true;
                }else {
                    return false;
                }
        }
        /*
         Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields
{2, 3, 1}.
         */
        public static int[] rotateElementsLeft (int[] array){
            int temp=array[0];
            array[0]=array[2];
            array[2]=temp;

            int temp2=array[0];
            array[0]=array[1];
            array[1]=temp2;

            return array;
        }
        /*
        Write a Java program to convert a given string into lowercase.
         */
        public static String convertToLowercase (String sentence){
            String result ="";
            result = sentence.toLowerCase();
            return result;
        }
        /*
        . Write a Java program to create a new string taking first three characters from a given
string. If the length of the given string is less than 3 use "#" as substitute characters
         */
        public static String buildStringFromThreeChars (String a){
            String newString="";
            if (a.length()>=3){
                newString = a.substring(0,3);
            }else if (a.length()==2){
                System.out.println(a.substring(0,2)+ "#");
            }else if (a.length()==1){
                System.out.println(a + "##");
            }else {
                System.out.println("###");
            }
            return newString;
        }
        /*
        Write a Java program to accept two string and test if the second string contains the first
        one.
         */
        public static boolean checkIfTheSecondContainsFirst (String a, String b){
            if(b.contains(a)){
                return true;
            }else{
                return false;
            }
        }
        /*
        Given a string, return a new string where "not " has been added to the front. However, if the
        string already begins with "not", return the string unchanged
         */
        public static String addNotToFront (String a){
            String sirNou = "";
            if(a.startsWith("not")){
                return a;
            }
            else {
                sirNou = "not " + a;
                return sirNou;
            }
        }
        /*
        Given a string, return a new string where the first and last chars have been exchanged.
         */
        public static String changeFirstAndLastChar(String a){
            String result="";
            int n = a.length();
            String firstChar = a.substring(0,1);
            String lastChar = a.substring(n-1);


            result = lastChar + a.substring(1,n-1) + firstChar;
            return result;
        }
        /*
        Given a string, return a string made of the first 2 chars (if present), however include first char
        only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
         */
        public static String includeFirstAndSecondChars (String a) {
            String result = "The word doesn't contain the specified chars";
                if ((a.length() >= 2) || (a.substring(0, 2).equals("oz"))) {
                    return "oz";
                } else if ((a.length() >= 2) || (a.substring(0, 1).equals("o"))) {
                    return "o";
                } else if ((a.length() >= 2) || (a.substring(1, 2).equals("z"))) {
                    return "z";
                } else {
                    return result;
                }
            }
        /*
        Return true if the given string contains between 1 and 3 'e' chars.
         */
        public static boolean containsEchars (String a){
            int count=0;
            for (int i=0; i<a.length(); i++){
                    if (a.charAt(i) == 'e'){
                    count++;
                    }
                }
            if (count>=1 && count<=3){
                return true;
            }
            else return false;
            }
        /*
        The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
        Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>"
         */
        public static String createHtmlString (String a, String b){
            String result = "";
            if (a != null && b!=null){
                result = "<" + a + ">" + b + "</" + a + ">";
            }
            return result;
        }
        /*
        Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".
        Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
         */
        public static String createStringWhereWordIsInTheMiddle (String a, String b){
            String c = "";
            if(a.length() == 4){
                c = a.substring(0,2) + b + a.substring(2,4);
            }
            return c;
        }
        /*
        Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
         */
        public static String returnTheFirstHalf (String a){
            if (a.length() % 2 == 0){
                a = a.substring(0,a.length()/2);
            }
            return a;
        }
        /*
        Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
         */
        public static String returnStringWithoutFirstAndLast (String a){
            if (a.length()>=2){
                a = a.substring(1,a.length()-1);
            }
            return a;
        }
        /*
        Given a string, return a string length 1 from its front, unless front is false,
        in which case return a string length 1 from its back. The string will be non-empty.
         */
        public static String returnLength1String (String a, boolean b){
            String c = "";
            if (a.length()>=1 && b == true){
                c = a.substring(0,1);
            }else if (a.length()>=1 && b == false){
                c = a.substring(a.length()-1);
            }
            return c;
        }
        /*
        Given a string and an index, return a string length 2 starting at the given index.
        If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
         */
        public static String startTheStringFromIndex (String a, int i) {
            String c = "";
            c = a.substring(i, i + 2);
                if (c.length() >= 2) {
                    c = a.substring(i, i + 2);
                } else c = a.substring(0, 2);
                return c;
            }
         /*
         Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
         so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
          */
        public static String makeAStringFromFirstAndLast (String a, String b){
            String c = "";
            if (a.length()>0 && b.length()>0){
                c = a.substring(0,1) + b.substring(b.length()-1);
            }else if(a.length()>0 && b.length() == 0){
                c = a.substring(0,1) + "@";
            }else
                c = "@" + b.substring(b.length()-1);
            return c;
        }
        /*
        Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
         */
        public static String returnTheColour (String n){
            if (n.startsWith("red")){
                n = "red";
            }else if (n.startsWith("blue")){
                n = "blue";
            }else
                n = "";
            return n;
        }
        /*
        Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
         */
        public static boolean checkIfTheFirstAppearAtTheEnd (String n){
            String last2Elements = n.substring(n.length()-2, n.length());
            if (n.substring(0,2).equals(last2Elements)){
                return true;
            }else
                return false;
        }
        /*
        Given two strings, append them together (known as "concatenation") and return the result.
        However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string
         */
        public static String concatenateTwoStrings (String n, String m) {
            String c = n;
            c = c.concat(m);
            String x = "";
            String y = "";
            if (n.length() == m.length())
                return c;
            if (n.length() > m.length()) {
                int diff = n.length() - m.length();
                x = n.substring(diff, n.length()) + m;
                return x;
            } else {
                int diff2 = m.length() - n.length();
                y = n + m.substring(diff2, m.length());
                return y;
            }
        }

    /*
    Given a string, return a version without the first 2 chars.
    Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
     */
    public static String keepTheFirstAndSecond (String a) {
        if(a.substring(0,1).equals('a') && a.substring(1,2).equals('b')) {
            return a;
        }
        if(a.charAt(0) == 'a'){
            return a.substring(0,1) + a.substring(2);
        }
        if(a.charAt(1) == 'b')
        {
            return a.substring(1);
        }
        return a.substring(2);
    }
    /*
    Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
     */
    public static String returnStringWithoutFirstAndLastChar (String n){
        String m="";
        if (n.length()>=2){
            m = n.substring(1, n.length()-2);
        }
        return m;
    }
    /*
    Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
    The string length will be at least 2.
     */
    public static String makeNewStringFromMiddleChars (String a){
        String b="";
        if (a.length()>=2){
            b = a.substring(a.length()/2-1, a.length()/2+1);
        }
        return b;
    }
    /*
    Given a string, return true if it ends in "ly"
     */
    public static boolean checkIfItEndsInLy (String n){
        if (n.substring(n.length()-2).equals("ly")){
            return true;
        }
        else
            return false;
    }
    /*
    Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
     */
    public static String putTheOrderAbba (String a, String b){
        String c="";
        c = a + b + b + a;
        return c;
    }
    /*
    Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.
     */
    public static String makeCopiesOfTheLastChars (String a){
        String b="";
        String lastTwoChars = a.substring(a.length()-2);
        if (a.length()>=2){
            b = lastTwoChars + lastTwoChars + lastTwoChars;
        }
        return b;
    }


        public static void main(String[] args) {

        int[] array = new int[7];
        array[0] = 10;
        array[1] = -20;
        array[2] = 0;
        array[3] = 30;
        array[4] = 40;
        array[5] = 60;
        array[6] = 10;

        boolean result = checkFirstAndLastElem(array);
        System.out.println(result);

        int[] array1 = new int[3];
        array1[0] = 5;
        array1[1] = -20;
        array1[2] = 5;

        boolean result1 = checkIfFirstAndLastAreSame(array1);
        System.out.println(result1);

        int[] array2 = new int[2];
        array2[0] = 2;
        array2[1] = 6;

        boolean result2 = verify4Or7(array2);
        System.out.println(result2);

        int[] array3 = new int[3];
        array3[0] = 60;
        array3[1] = 30;
        array3[2] = 40;

        int result3 = largerValue(array3);
        System.out.println(result3);

        int[] array4 = new int[5];
        array4[0] = 1;
        array4[1] = 2;
        array4[2] = 3;
        array4[3] = 4;
        array4[4] = 5;

        countEvenOrOdd(array4);

        int[] array5 = new int[3];
        array5[0] = 2;
        array5[1] = 3;
        array5[2] = 4;

        boolean result5 = checkIf6Exists(array5);
        System.out.println(result5);

        int[] array6 = new int[3];
        array6[0] = 1;
        array6[1] = 2;
        array6[2] = 3;

        int[] result6 = rotateElementsLeft(array6);
            for(int element: result6){
                System.out.println(element);
            }
        System.out.println(result6);

        String result7 = convertToLowercase("AFARA este SOARE si cald");
        System.out.println(result7);

        String result8 = buildStringFromThreeChars("Al");
        System.out.println(result8);

        Boolean result9 = checkIfTheSecondContainsFirst("catel","catelus");
        System.out.println(result9);

        String result10 = addNotToFront("dog");
        System.out.println(result10);

        String result11 = changeFirstAndLastChar("chloe");
        System.out.println(result11);

        String result12 = includeFirstAndSecondChars("oainca");
        System.out.println(result12);

        Boolean result13 = containsEchars("American Dream");
        System.out.println(result13);

        String result14 = createHtmlString("html", "Hi");
        System.out.println(result14);

        String result15 = createStringWhereWordIsInTheMiddle("<<>>", "Hi");
        System.out.println(result15);

        String result16 = returnTheFirstHalf("CeliaPlescan");
        System.out.println(result16);

        String result17 = returnStringWithoutFirstAndLast("Celia");
        System.out.println(result17);

        String result18 = returnLength1String("Celia", false);
        System.out.println(result18);

        String result19 = startTheStringFromIndex("Carte", 1);
        System.out.println(result19);

        String result20 = makeAStringFromFirstAndLast("Primul", "Ultimul");
        System.out.println(result20);

        String result21 = returnTheColour("redPhone");
        System.out.println(result21);

        Boolean result22 = checkIfTheFirstAppearAtTheEnd("anioioyan");
        System.out.println(result22);

        String result23 = concatenateTwoStrings("maria","ana");
        System.out.println(result23);

        String result24 = keepTheFirstAndSecond("amandoua");
        System.out.println(result24);

        String result25 = returnStringWithoutFirstAndLast("Proiect");
        System.out.println(result25);

        String result26 = makeNewStringFromMiddleChars("Middle");
        System.out.println(result26);

        Boolean result27 = checkIfItEndsInLy("heavenly");
        System.out.println(result27);

        String result28 = putTheOrderAbba("Hi", "Bye");
        System.out.println(result28);

        String result29 = makeCopiesOfTheLastChars("CocaCola");
        System.out.println(result29);

    }
}
