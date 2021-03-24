package com.en.celia;

public class ex6 {
    public static double calculateAriaOfRectangle(double length1, double length2) {
        double area = length1 * length2;
        return area;
    }

    public static double calculatePerimeter (double length, double height){
        double perimeter = 2 * (length + height);
        return perimeter;
    }
    public static void main(String[] args) {

        double result = calculateAriaOfRectangle(5.5, 8.5);
        double result1 = calculatePerimeter(5.5, 8.5);
        System.out.println("Aria dreptunghiului este: " + result);
        System.out.println("Perimetrul dreptunghiului este: " + result1);
    }
}
