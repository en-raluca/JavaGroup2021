package com.en.andrei.oop.problem1;

/**
 * Created by atpop on 01 Apr 2021
 */

public class Main {

    public static void main(String[] args) {
        Flower myFlower = new Flower("Lalea","Rosie", 5);
        myFlower.saySomethingSpecialAbout();

        Plant myPlant = new Plant("Ficus");
        System.out.println(myPlant.toString());

        Tree myTree = new Tree("Cires",100, 7);
        myTree.saySomethingSpecialAbout();
        myTree.setAge(8);
        System.out.println("My tree age is: " + myTree.getAge());
    }
}
