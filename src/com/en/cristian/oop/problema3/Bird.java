package com.en.cristian.oop.problema3;

public class Bird extends Animal {
    public Bird(String nume, String categorie) {
        super(nume, categorie);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("cip-cirip");
    }
}
