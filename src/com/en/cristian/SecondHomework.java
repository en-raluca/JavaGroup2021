package com.en.cristian;

public class SecondHomework {
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
        if(str1.equals(str2)){
            result=true;
        }else{
            result=false;
        }
        return result;
    }

    public static void main(String[] args) {
        String convertStringToLowerCase = convertGivenString("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.");
        System.out.println(convertStringToLowerCase);

        String penultimateWord = findPenultimateWord("The quick brown fox jumps over the lazy dog.");
        System.out.println(penultimateWord);

        String concatenateString = concatenationOfTwoString("Python", "Tutorial");
        System.out.println(concatenateString);

        String firstThreeCharacter = takeFirstThreeCharacter(" ");
        System.out.println(firstThreeCharacter);

        boolean secondStrContainsFirstStr=testSecondStrContainsFirstStr("Once in a blue moon", "See eye to eye");
        System.out.println(secondStrContainsFirstStr);
    }
}
