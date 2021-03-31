package com.en.cristian.oop.problema3;

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
