package com.en.celia.OOP;

public class Fish extends Pet implements Pets{
    public Fish(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void play() {
        System.out.println("pestele innoata in acvariu");
    }
}
