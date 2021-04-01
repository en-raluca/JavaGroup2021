package com.en.diana.Homework3OOP;

public class Cat2 extends Animal {
    public Cat2(String nume, String categorie) {
        super(nume, categorie);
    }

    @Override
    public void makeSound() {
        System.out.println("miau-miau");
    }
}
