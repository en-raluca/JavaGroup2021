package com.en.elena.courseoop.course1;

public class Person {
    private String name;
    private String surName;
    private int age;
    public Person(String name, String surName, int age){
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getSurName(){
        return surName;
    }
    public int getAge(){
        return age;
    }
    public void setName(String Name){
        this.name = name;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
 public void setAge(int age){
        this.age = age;
 }


}
