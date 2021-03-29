package com.en.raul;

public class Tema2 {
    public static void main(String[] args){
        System.out.println(lastLetter("cat"));
        System.out.println(last3Letter("hello"));

        int[] myArr2 = {3,2,4,5,4,6,7};
        countOddEven(myArr2);
        firstOccurence(myArr2,2);

        int[] arrFront = {1,9,5};
        System.out.println(front9(arrFront));

        int[] arr3 = {1,4,5,5,3,2,1};
        System.out.println(numberOfAppearence(arr3));

        int[] arr4 = {1,5,3};
        System.out.println(largestNumber(arr4));

        System.out.println(lastWord("The quick brown fox jumps over the lazy dog."));

        System.out.println(charactersFromString("Pythonnn"));

        System.out.println(checkHi("hello hi"));

        System.out.println(deleteDel("adelHello"));
        System.out.println(helloName("Bob"));
        System.out.println(makeAbba("Hi","Bye"));
        System.out.println(makeOutWord("<<>>","Yay"));
        System.out.println(theEnd("Hello",true));
        System.out.println(withotEnd2("ab"));
        System.out.println(hasBad("xxbadxx"));
        System.out.println(frontAgain("edit"));

    }

    public static String lastLetter(String a){
        String rezultat;
        char ch = a.charAt(a.length()-1);
        rezultat = ch+a+ch;
        return rezultat;
    }

    public static String last3Letter(String a){
        String rezultat="";
        String temp="";
        String initialWord="";
        if(a.length()>3){
            temp=a.substring(a.length()-3);
            temp=temp.toUpperCase();
            initialWord=a.substring(0,a.length()-3);
        }else{
            temp=a.toUpperCase();
        }
        return initialWord+temp;
    }

    public static void countOddEven(int[] arr){
        int odd=0;
        int even=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("The number of even numbers are: "+even);
        System.out.println("The number of odd numbers are: "+odd);
    }

    public static void firstOccurence(int[] arr,int num){
        int temp=0;
        boolean exists = true;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == num) {
                temp = i;
                System.out.println("The number " + num + " first occured on position: " + temp);
                break;
            }
        }
    }

    public static boolean front9(int[] arr){
        boolean is9=false;
        if(arr.length>4){
            for(int i=0;i<arr[3];i++){
                if(arr[i] == 9){
                    is9=true;
                    break;
                }
            }
        }else{
            for(int i=0;i<arr.length;i++){
                if (arr[i] == 9){
                    is9=true;
                    break;
                }
            }
        }
        return is9;
    }

    public static int numberOfAppearence(int[] arr){
        int appearence=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==9){
                appearence++;
            }
        }
        return appearence;
    }

    public static int largestNumber(int[] arr){
        int result=0;
        int firstElement=0;
        int middleElement=0;
        int lastElement=0;

        if(arr.length>=1){
            firstElement=arr[0];
            middleElement=arr[arr.length/2];
            lastElement=arr[arr.length-1];
        }

        if(firstElement>middleElement && firstElement>lastElement){
            result=firstElement;
        }else if(middleElement>firstElement && middleElement >lastElement){
            result=middleElement;
        }else if(lastElement>firstElement && lastElement>middleElement){
            result=lastElement;
        }
        return result;
    }

    public static String lastWord(String a){
        String[] words=a.split("[ ]+");
        return words[words.length-2];
    }

    public static String charactersFromString(String a){
        String result="";
        if(a.length()<3){
            result="###";
        }else{
            result=a.substring(0,3);
        }
        return result;
    }

    public static boolean checkHi(String a){
        boolean isHi=false;
        String first2="";
        if(a.length()<2){
            isHi=false;
        }else{
            first2=a.substring(0,2);
            if(first2.equals("hi")){
                isHi=true;
            }
        }
        return isHi;
    }

    public static String deleteDel(String a){
        String result="";
        if(a.startsWith("del",1)){
            result=a.replaceAll("del","");
        }
        return result;
    }

    public static String helloName(String a){
        return "Hello " + a + "!";
    }

    public static String makeAbba(String a, String b){
        return a+b+b+a;
    }

    public static String makeOutWord(String a, String b) {
        return (a.substring(0, 2) + b + a.substring(2, 4));
    }

    public static String theEnd(String a, boolean bool){
        String result="";
        if(bool == true){
            result=a.substring(0,1);
        }else{
            result=a.substring(a.length()-1);
        }
        return result;
    }

    public static String withotEnd2(String a){
        int length=a.length();
        if(length>=3){
            return a.substring(1,a.length()-1);
        }else {
            return "";
        }
    }

    public static boolean hasBad(String a){
        int length=a.length();
        boolean isTrue=false;
        if(length==3&&a.contains("bad")){
            isTrue = true;
        }else if(length >=4){
            if((a.substring(0,3).equals("bad")) || (a.substring(1,4).equals("bad"))){
                isTrue = true;
            }
        }else{
            isTrue = false;
        }
        return isTrue;
    }

    public static boolean frontAgain(String a){
        int length=a.length();
        boolean isTrue=false;
        String lastTwo=a.substring(a.length()-2);

        if(length>=2){
            if(a.substring(0,2).equals(lastTwo)){
                isTrue =true;
            }else{
                isTrue = false;
            }
        }
        return isTrue;
    }

}
