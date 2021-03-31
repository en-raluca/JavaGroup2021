package com.en.elena.practiceoop.pb3;

public class Cat extends Animal{

    public Cat(String name, String category) {
        super(name, category);
    }

    @Override
    public void makeSound() {
        System.out.println("miau-miau");
    }
}
