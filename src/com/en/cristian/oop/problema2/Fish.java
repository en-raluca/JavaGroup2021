package com.en.cristian.oop.problema2;

public class Fish extends Pet {
    public Fish(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("pestele inoata in acvariu");
    }
}
