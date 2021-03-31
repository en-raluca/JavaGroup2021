package com.en.diana;

import java.util.Arrays;

public class Homework2 {
    //ARRAYS
    /*1. Write a Java program to test if 10 appears as either the first or last element of an array of integers.
     The length of the array must be greater than or equal to 2
     Sample Output:
     Test Data: array = 10, -20, 0, 30, 40, 60, 10
        true */
    public static boolean appearedNumber(int[] array) {
        boolean rez = false;
        if (array[0] == 10 || array[array.length - 1] == 10) {
            rez = true;
        } else {
            rez = false;
        }
        return rez;
    }

    //7. Write a Java program to sum values of an array.
    public static int addElements(int[] array2) {
        int sum = 0;
        for (int elem : array2) {
            sum = elem + sum;
        }
        return sum;
    }

    //8. Write a Java program to calculate the average value of array elements.
    public static double calculateAverage(int[] array3) {
        double average = 0;
        double sum = 0;
        for (int i : array3) {
            sum += i;
            average = sum / array3.length;
        }

        return average;
    }

    //11. Write a Java program to find the maximum and minimum value of an array.
    public static int[] findMinAndMax(int[] array4) {
        int min = array4[0];
        int max = array4[0];
        for (int i : array4) {
            if (i >= max) {
                max = i;
            }
            if (i <= min) {
                min = i;
            }
        }
        System.out.println("Maximunl este: " + max);
        System.out.println("Minimul este: " + min);
        int[] arr = new int[2];
        arr[0] = max;
        arr[1] = min;
        return arr;
    }

    //14. Write a Java program to check if an array of integers contains two specified elements 65 and 77.
    public static boolean containedElement(int[] array5) {
        boolean a = false;
        boolean b = false;
        for (int i : array5) {
            if (i == 65) {
                a = true;
            }
            if (i == 77) {
                b = true;
            }
        }
        if (a == true && b == true) {
            return true;
        } else
            return false;
    }

    // ARRAY(Level 1)
    /* 1) Given an array of ints, return true if 6 appears as either the first or last element in the array.
    The array will be length 1 or more.
    firstLast6([1, 2, 6]) → true
    firstLast6([6, 1, 2, 3]) → true
    firstLast6([13, 6, 1, 2, 3]) → false */
    public static boolean isFirstOrLast(int[] array6) {
        boolean is = false;
        if (6 == array6[0] || 6 == array6[array6.length - 1]) {
            is = true;
        } else {
            is = false;
        }
        return is;
    }

    /* 6) Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3}
    becomes {3, 2, 1}.
    reverse3([1, 2, 3]) → [3, 2, 1]
    reverse3([5, 11, 9]) → [9, 11, 5]
    reverse3([7, 0, 0]) → [0, 0, 7] */
    public static int[] returnReverse(int[] array7) {
        int[] arr = new int[3];
        for (int i = 0; i <= array7.length - 1; i++) {
            arr[i] = array7[array7.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    /* 14) Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
    Return the array which has the largest sum. In event of a tie, return a.
    biggerTwo([1, 2], [3, 4]) → [3, 4]
    biggerTwo([3, 4], [1, 2]) → [3, 4]
    biggerTwo([1, 1], [1, 2]) → [1, 2 */
    public static int[] areBiggerTwo(int[] a, int[] b) {
        int suma1 = 0;
        int suma2 = 0;
        for (int i : a) {
            suma1 = suma1 + i;
        }
        for (int j : b) {
            suma2 = suma2 + j;
        }
        if (suma1 >= suma2) {
            System.out.println(Arrays.toString(a));
            return a;
        } else {
            System.out.println(Arrays.toString(b));
            return b;
        }
    }

    /*19) Given an array of ints of odd length, look at the first, last, and middle values in the array and
    return the largest. The array length will be a least 1.
    maxTriple([1, 2, 3]) → 3
    maxTriple([1, 5, 3]) → 5
    maxTriple([5, 2, 3]) → 5 */
    public static int isLargest(int[] array10) {
        int largest = 0;
        for (int x : array10) {
            if (largest < x) {
                largest = x;
            }
        }
        return largest;
    }

    /* 20) Given an int array of any length, return a new array of its first 2 elements.
    If the array is smaller than length 2, use whatever elements are present.
     frontPiece([1, 2, 3]) → [1, 2]
     frontPiece([1, 2]) → [1, 2]
     frontPiece([1]) → [1] */
    public static int[] areFrontPiece(int[] array11) {
        int[] newAarr = new int[2];
        if (array11.length >= 2) {
            newAarr[0] = array11[0];
            newAarr[1] = array11[1];
        }
        if (array11.length == 1) {
            newAarr[0] = array11[0];
        }
        System.out.println(Arrays.toString(newAarr));
        return newAarr;
    }

    //    STRING
    /* 1) Given a string, return a new string where "not " has been added to the front. However, if the string
     already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
     * notString("candy") → "not candy"
     * notString("x") → "not x"
     * notString("not bad") → "not bad"
     */
    public static String addNot(String str) {
        String notString = "";
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            notString = str;

        } else {
            notString = "not " + str;
        }

        return notString;
    }

    /*5) Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and
     back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
    front22("kitten") → "kikittenki"
    front22("Ha") → "HaHaHa"
    front22("abc") → "ababcab"*/
    public static String addTwoChars(String charTwo) {
        String newString = "";
        if (charTwo.length() > 2) {
            String two = charTwo.substring(0, 2);
            newString = two + charTwo + two;
        }
        if (charTwo.length() <= 2) {
            newString = charTwo + charTwo + charTwo;
        }
        return newString;
    }

    /*9) Given a string, return a string made of the first 2 chars (if present), however include first char only
     if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"*/
    public static String addOZ(String wordOZ) {
        String newWord = "";
        char first = wordOZ.charAt(0);
        char second = wordOZ.charAt(1);

        if (first == 'o') {
            if (second == 'z') {
                newWord = wordOZ.substring(0, 2);
            }
        }
        return newWord;
    }

    /*10) Return true if the given string contains between 1 and 3 'e' chars.
    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false*/
    public static boolean hasE(String eword) {
        int lung = eword.length();
        int count = 0;
        for (int i = 0; i < lung; i++) {
            if (eword.charAt(i) == 'e')
                count++;
        }
        if (count >= 1 && count <= 3)
            return true;
        else
            return false;

    }

    //STRING (level 1)
    /*1) Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"*/
    public static String printName(String name) {
        String gretting = "Hello " + name + "!";
        return gretting;
    }

    /*10) Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
    The string length will be at least 2.
    right2("Hello") → "loHel"
    right2("java") → "vaja"
    right2("Hi") → "Hi"*/
    public static String rotatedVersion(String rotate) {
        String theNew = "";
        String rotation = "";
        if (rotate.length() >= 2) {
            rotation = rotate.substring(rotate.length() - 2, rotate.length());
            theNew = rotation + rotate;
        }
        return theNew;
    }

    /*13) Given a string, return a string length 1 from its front, unless front is false, in which case return a
    string length 1 from its back. The string will be non-empty.
    theEnd("Hello", true) → "H"
    theEnd("Hello", false) → "o"
    theEnd("oh", true) → "o"*/
    public static String isAtTheEnd(String word, boolean first) {
        String newWord = "";
        if (first) {
            newWord = word.substring(0, 1);
        } else {
            newWord = word.substring(word.length() - 1);
        }
        return newWord;
    }


    /*18) Given a string, return true if it ends in "ly".
    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false*/
    public static boolean hasLy(String ends) {
        boolean has = false;
        String contains = ends.substring(ends.length() - 2, ends.length());
        System.out.println(contains);
        if (contains.equals("ly")) {
            has = true;
        }
        return has;
    }

    /*19) Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    The string length will be at least 3.
    middleThree("Candy") → "and"
    middleThree("and") → "and"*/
    public static String isMiddle(String middle) {
        String newOne = "";
        int len = middle.length() / 2;
        if (middle.length() >= 3) {
            newOne = middle.substring(len - 1, len + 2);
        }
        return newOne;
    }

    /*21) Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2,
    use '@' for the missing chars.
    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"*/
    public static String hasTwoChar(String str) {
        String newStr = "";
        if (str.length() == 0) {
            newStr = "@@";
        } else if (str.length() < 2) {
            newStr = str + '@';
        } else {
            newStr = str.substring(0, 2);
        }
        return newStr;
    }

    /*26) Given a string, return true if the first 2 chars in the string also appear at the end of the string,
     such as with "edited".
    frontAgain("edited") → true
    frontAgain("edit") → false
    frontAgain("ed") → true*/
    public static boolean hasAtTheEnd(String str) {
        boolean areSame = false;
        if (str.length() < 2) {
            areSame = false;
        } else if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))){
            areSame = true;
        }
        else {
            areSame = false;
        }
        return areSame;
    }

    /*32) Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged.
    withoutX("xHix") → "Hi"
    withoutX("xHi") → "Hi"
    withoutX("Hxix") → "Hxi"*/
    public static String chekedWord(String word) {
        if (word.length() == 0) {
            return word;

        }
        if (word.length() == 1) {
            if (word.charAt(0) == 'x') {
                return "";
            } else {
                return word;
            }
        }
        if (word.charAt(0) == 'x') {
            word = word.substring(1, word.length());
        }
        if (word.charAt(word.length() - 1) == 'x') {
            word = word.substring(0, word.length() - 1);
        }
        return word;
    }

    public static void main(String[] args) {
        int[] array1 = new int[7];
        array1[0] = 10;
        array1[1] = -20;
        array1[2] = 0;
        array1[3] = 30;
        array1[4] = 40;
        array1[5] = 60;
        array1[6] = 10;
        boolean result1 = appearedNumber(array1);
        System.out.println(result1);

        int[] array2 = new int[4];
        array2[0] = 10;
        array2[1] = 4;
        array2[2] = 8;
        array2[3] = 2;
        System.out.println(addElements(array2));

        int[] array3 = new int[4];
        array3[0] = 10;
        array3[1] = 4;
        array3[2] = 8;
        array3[3] = 2;
        System.out.println(calculateAverage(array3));

        int[] array4 = new int[4];
        array4[0] = 10;
        array4[1] = 4;
        array4[2] = 8;
        array4[3] = 2;
        System.out.println(findMinAndMax(array4));

        int[] array5 = new int[5];
        array5[0] = 7;
        array5[1] = 65;
        array5[2] = 75;
        array5[3] = 77;
        array5[4] = 45;
        System.out.println(containedElement(array5));

        int[] array6 = {6, 1, 2, 3};
        System.out.println(isFirstOrLast(array6));

        int[] array7 = {1, 2, 3};
        System.out.println(returnReverse(array7));

        int[] array8 = {1, 2};
        int[] array9 = {3, 4};
        System.out.println(areBiggerTwo(array8, array9));

        int[] array10 = {1, 2, 3};
        System.out.println(isLargest(array10));

        int[] array11 = {1, 2, 3};
        System.out.println(areFrontPiece(array11));

        String result = addNot("candy");
        System.out.println(result);

        String results = addTwoChars("kitten");
        System.out.println(results);

        String rezultat = addOZ("ozymandias");
        System.out.println(rezultat);

        boolean rez = hasE("Hello");
        System.out.println(rez);

        String resultGretting = printName("Bob");
        System.out.println(resultGretting);

        String resultRotate = rotatedVersion("Hello");
        System.out.println(resultRotate);

        String resultString = isAtTheEnd("Hello", true);
        System.out.println(resultString);


        boolean resultHas = hasLy("oddly");
        System.out.println(resultHas);

        String resultMiddle = isMiddle("Candy");
        System.out.println(resultMiddle);

        String resultNewStr = hasTwoChar("hello");
        System.out.println(resultNewStr);

        Boolean resultHasTwo = hasAtTheEnd("edited");
        System.out.println(resultHasTwo);

        String resultCheked = chekedWord("xHix");
        System.out.println(resultCheked);

    }
}
