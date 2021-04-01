package com.en.andrada.Tema3.ex1;

public class Tree extends Plant {
    private double height;
    private int age;

    public Tree(String name, double height, int age){
        super(name);
        this.height=height;
        this.age=age;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void saySomethingSpecialAbout(){
        System.out.println("There are a lot of trees at Botanical Garden!");
    }
}
