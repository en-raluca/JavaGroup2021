package com.en.cristian;

public class SecondHomework {

    //Arrays

    /**
     * 1.Write a Java program to test if 10 appears as either the first or last element of an array of integers.
     * The length of the array must be greater than or equal to 2
     */
    public static boolean testFirstAndLastNumber(int[] array) {
        boolean result = false;
        if (array[0] == 10 && array[array.length - 1] == 10) {
            result= true;
        } else {
           result= false;
        }
        return result;
    }

    /**
     2.Write a Java program to test if the first and the last element of an array of integers are same.
     The length of the array must be greater than or equal to 2
     */
    public static boolean checkFirstAndLastNumberAreTheSame(int[] array) {
        boolean result = false;
        if (array[0] == 10 && array[array.length - 1] == 10) {
            result= true;
        } else {
            result= false;
        }
        return result;
    }

    /**
     3.Write a program to test that a given array of integers of length 2 contains a 4 or a 7.
     */
    public static boolean checkIfArrayContainsANumber(int[] array) {
        boolean result = false;
        if (array[0] == 4 || array[array.length - 1] == 7) {
            result= true;
        } else {
            result= false;
        }
        return result;
    }

    //Strings

    /**
     * 1.Write a Java program to convert a given string into lowercase.
     */
    public static String convertGivenString(String word) {
        String result = "";
        result = word.toLowerCase();
        return result;
    }

    /**
     * 2.Write a Java program to find the penultimate (next to last) word of a sentence
     */
    public static String findPenultimateWord(String string) {
        String[] word = string.split(" ");
        String result = word[word.length - 2];
        return result;
    }

    /**
     * 3.Write a Java program to create the concatenation of the two strings except removing
     * the first character of each string. The length of the strings must be 1 and above.
     */
    public static String concatenationOfTwoString(String firstString, String secondString) {
        String result = "";
        if (firstString.length() > 1) {
            result = result + firstString.substring(1);
        }
        if (secondString.length() > 1) {
            result = result + secondString.substring(1);
        }
        return result;
    }

    /**
     * 4.Write a Java program to create a new string taking first three characters from a given string.
     * If the length of the given string is less than 3 use "#" as substitute characters.
     */
    public static String takeFirstThreeCharacter(String string) {
        String result = "";
        if (string.length() > 3) {
            result = string.substring(0, 3);
        } else {
            result = "###";
        }
        return result;
    }

    /**
     * 5.Write a Java program to accept two string and test if the second string contains the first one.
     */
    public static boolean testSecondStrContainsFirstStr(String str1, String str2) {
        boolean result = false;
        if (str1.equals(str2)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * 1.Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string unchanged.
     * Note: use .equals() to compare 2 strings.
     * notString("candy") → "not candy"
     * notString("x") → "not x"
     * notString("not bad") → "not bad"
     */
    public static String returnANewString(String string) {
        String newString = "";
        if (string.length() >= 3 && string.substring(0, 3).equals("not")) {
            newString = string;
        } else
            newString = "not " + string;
        return newString;
    }

    /**
     * 9.Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
     * startOz("ozymandias") → "oz"
     */
    public static String returnStringWithTwoCharacters(String string) {
        String result = "";
        if (string.length() >= 2 && string.charAt(0) == 'o' && string.charAt(1) == 'z') {
            result = result + string.charAt(0) + string.charAt(1);
        } else {
            result =string;
        }
        return result;
    }

    /**
     * Return true if the given string contains between 1 and 3 'e' chars.
     * stringE("Hello") → true
     * stringE("Heelle") → true
     * stringE("Heelele") → false
     */
    public static boolean checkE(String str) {
        boolean result = false;
        int eCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                eCount++;
            }
        }
        if (eCount >= 1 && eCount <= 3) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * 12.Given a non-empty string and an int N, return the string made starting with char 0,
     * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
     * everyNth("Miracle", 2) → "Mrce"
     * everyNth("abcdefg", 2) → "aceg"
     * everyNth("abcdefg", 3) → "adg"
     */
    public static String everyNth(String text, int position) {
        String result = "";

        for (int i = 0; i < text.length(); i=i+position) {
            result = result +text.charAt(i);
        }
        return result;
    }

    /**
     Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     helloName("Bob") → "Hello Bob!"
     helloName("Alice") → "Hello Alice!"
     helloName("X") → "Hello X!"
     */
    public static String helloName(String name){
        String result= "Hello " + name + "!";
        return result;
    }

    /**
     Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
     public String makeAbba(String a, String b) {
     }
     makeAbba("Hi", "Bye") → "HiByeByeHi"
     makeAbba("Yo", "Alice") → "YoAliceAliceYo"
     makeAbba("What", "Up") → "WhatUpUpWhat"
     */
    public static String makeAbba(String a, String b){
        String result=a+b+b+a;
        return result;
    }

    /**
     13.Given a string, return a string length 1 from its front, unless front is false,
     in which case return a string length 1 from its back. The string will be non-empty.
     theEnd("Hello", true) → "H"
     theEnd("Hello", false) → "o"
     theEnd("oh", true) → "o"
     */
    public static String theEnd(String text, boolean verify){
        String result="";
        if(verify==true){
            result=result+text.substring(0,1);
        }else {
            result=result+text.substring(text.length()-1);
        }
        return result;
    }

    public static void main(String[] args) {

        //Arrays
        int[] array = new int[7];
        array[0] = 10;
        array[1] = -20;
        array[2] = 0;
        array[3] = 30;
        array[4] = 40;
        array[5] = 60;
        array[6] = 10;
        boolean result = testFirstAndLastNumber(array);
        System.out.println(result);

        int[] array1 = new int[7];
        array1[0] = 50;
        array1[1] = -20;
        array1[2] = 0;
        array1[3] = 30;
        array1[4] = 40;
        array1[5] = 60;
        array1[6] = 10;
        boolean result1 = checkFirstAndLastNumberAreTheSame(array1);
        System.out.println(result1);

        int array2[]=new int[2];
        array2[0]=5;
        array2[1]=7;
        boolean result2=checkIfArrayContainsANumber(array2);
        System.out.println(result2);


        //Strings
        String convertStringToLowerCase = convertGivenString("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.");
        System.out.println(convertStringToLowerCase);

        String penultimateWord = findPenultimateWord("The quick brown fox jumps over the lazy dog.");
        System.out.println(penultimateWord);

        String concatenateString = concatenationOfTwoString("Python", "Tutorial");
        System.out.println(concatenateString);

        String firstThreeCharacter = takeFirstThreeCharacter(" ");
        System.out.println(firstThreeCharacter);

        boolean secondStrContainsFirstStr = testSecondStrContainsFirstStr("Once in a blue moon", "See eye to eye");
        System.out.println(secondStrContainsFirstStr);

        String newStr = returnANewString("candy");
        System.out.println(newStr);
        String newStr1 = returnANewString("x");
        System.out.println(newStr1);
        String newStr2 = returnANewString("not bad");
        System.out.println(newStr2);

        String string = returnStringWithTwoCharacters("ozymadias");
        System.out.println(string);
        String string1 = returnStringWithTwoCharacters("bzoo");
        System.out.println(string1);
        String string2 = returnStringWithTwoCharacters("oxx");
        System.out.println(string2);

        boolean resultE = checkE("Hello");
        System.out.println(resultE);

        String text = everyNth("Miracle", 2);
        System.out.println(text);

        String name=helloName("Cristian");
        System.out.println(name);

        String txt=makeAbba("Hi", "Bye");
        System.out.println(txt);

        String txtEnd=theEnd("Hello", true);
        System.out.println(txtEnd);
    }
}
