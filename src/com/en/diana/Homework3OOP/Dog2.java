package com.en.diana.Homework3OOP;

public class Dog2 extends Animal {
    public Dog2(String nume, String categorie) {
        super(nume, categorie);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("ham-ham");
    }
}
