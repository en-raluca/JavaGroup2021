package com.en.cristian.oop.problema3;

public class Cat2 extends Animal {
    public Cat2(String nume, String categorie) {
        super(nume, categorie);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("miau-miau");
    }
}
