package com.en.celia.OOP;

public class Dog extends Pet {
    public Dog(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("catelusul alearga in curte");
    }
}
