package com.en.andrada;

import java.util.ArrayList;
import java.util.Locale;

public class Tema2 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 9;
        arr1[1] = 9;
        arr1[2] = 2;
        arr1[3] = 9;
        arr1[4] = 3;
        int result1=returnNumberOf9(arr1);
        System.out.println("In array are "+result1+ " of 9's");

        int[] arr2 = new int[5];
        arr2[0] = 9;
        arr2[1] = 65;
        arr2[2] = 2;
        arr2[3] = 77;
        arr2[4] = 3;
        boolean result2=checkIfContains65And75(arr2);
        System.out.println(result2);

        int result3=returnIndex(arr2,77);
        System.out.println("Element 65 have index: "+result3);

        int[] arr3=new int[3];
        int[] result4=returnNewArray(arr3,arr2);
        for (int element : result4) {
            System.out.println(element);
        }

        String text = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String res1=upperCaseToLowerCase(text);
        System.out.println(res1);

        String text2="candy";
        String res2=notString(text2);
        System.out.println(res2);

        String text3="Miracle";
        String res3=everyNth(text3,2);
        System.out.println(res3);

        String text4="xHxix";
        String res4=withoutX(text4);
        System.out.println(res4);

        String text5="HiHello";
        String subtext="Hi";
        String res5=without2(text5,subtext);
        System.out.println(res5);

    }
    public static int returnNumberOf9 (int[] arr) {
        int result=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==9) {
                result++;
            }
        }
        return result;

    }
    public static boolean checkIfContains65And75(int[] arr){
        boolean result1=false;
        boolean result2=false;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 65) {
                result1=true;
            }
        }
        for(int j=0;j<arr.length;j++) {
            if (arr[j] == 77) {
                result2=true;
            }
        }
        return result1&result2;
    }
    public static int returnIndex(int[] arr, int element){
        int result=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==element){
                result=i;
            }
        }
        return result;
    }
    public static int[] returnNewArray(int[] arr1, int[] arr2){
        int[] result = new int[2];
        result[0]=arr1[0];
        result[1]=arr2[1];
        if (arr1==null) {
            result =new int[1];
            result[0]=arr2[0];
        }
        if (arr2==null) {
            result =new int[1];
            result[0]=arr1[0];
        }
        if((arr1.length==1)&(arr2.length==1))
        {
            result[0]=arr1[0];
            result[1]=arr2[0];
        }
        return result;
    }
    public static String upperCaseToLowerCase (String str){
        String result = "";
        result=str.toLowerCase(Locale.ROOT);
        return result;
    }
    public static String notString(String str){
        String result="";
        String prefix = "not";
        result=prefix.concat(str);
        if(str.startsWith("not")){
            result=str;
        }
        return result;
    }
    public static String everyNth(String str, int n ){
        String result="";
        for(int i=0; i<str.length();i=i+n) {
            result=result+str.charAt(i);
        }
        return result;
    }
    public static String withoutX(String str) {
        String result="";
        if ((str.charAt(0)!='x')&(str.charAt(str.length()-1)!='x')){
            result=str;
        }
        if(str.charAt(0)=='x'){
            result=str.substring(1,str.length()-1);
        }
        if(str.charAt(str.length()-1)=='x'){
            result=str.substring(0,str.length()-1);
        }
        if((str.charAt(0)=='x')&(str.charAt(str.length()-1)=='x')){
            result=str.substring(1,str.length()-1);
        }
        return result;
    }
    public static String without2(String str, String substr){
        String result="";
        if (str.length()==substr.length()) {
            result=str;
        }
        if (str.startsWith(substr)){
            result=str.substring(substr.length());
        }
        if(str.endsWith(substr)){
            result=str.substring(0,str.length()-substr.length());
        }
        return result;
    }

}
