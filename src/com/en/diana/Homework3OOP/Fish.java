package com.en.diana.Homework3OOP;

public class Fish extends Pet {
    public Fish(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void play() {
        System.out.println("pestele inoata in acvariu");
    }
}
