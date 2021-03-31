package com.en.diana.Homework3OOP;

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
