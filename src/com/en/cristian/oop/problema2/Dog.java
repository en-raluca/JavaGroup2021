package com.en.cristian.oop.problema2;

public class Dog extends Pet {
    public Dog(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("catelul alearga in curte");
    }
}
