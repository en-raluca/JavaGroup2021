package com.en.cristian.oop.problema2;

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
