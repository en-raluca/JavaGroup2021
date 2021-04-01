package com.en.diana.Homework3OOP;

public class Cat extends Pet {
    public Cat(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void play() {
        System.out.println("pisica toarce");
    }
}
