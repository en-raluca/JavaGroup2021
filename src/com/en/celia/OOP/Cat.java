package com.en.celia.OOP;

public class Cat extends Pet {
    public Cat(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("pisica toarce");
    }
}
