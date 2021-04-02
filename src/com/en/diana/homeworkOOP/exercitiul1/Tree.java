package com.en.diana.homeworkOOP.exercitiul1;

public class Tree extends Plant {
    private double height;
    private double age;

    public Tree(String name, double height, double age) {
        super(name);
        this.height = height;
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public void saySomethingSpecialAbout() {
        System.out.println("There are a lot of trees at Botanical Garden!");
    }
}
