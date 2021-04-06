package com.en.raul.Problema1;

public class Tree extends Plant {
    int height;
    int age;

    public Tree(int height,int age,String name) {
        super(name);
        this.height=height;
        this.age=age;
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

    @Override
    public void saySomethingSpecialAbout(){
        System.out.println("There are a lot of trees at Botanical Garden!");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
