package com.en.andrei.oop.problem1;

/**
 * Created by atpop on 31 Mar 2021
 */

public class Tree extends Plant {

    private int height;
    private int age;

    public Tree(String name, int height, int age) {
        super(name);
        this.height = height;
        this.age = age;
    }

    @Override
    public void saySomethingSpecialAbout() {
        System.out.println("There are a lot of trees at Botanical Garden!");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
