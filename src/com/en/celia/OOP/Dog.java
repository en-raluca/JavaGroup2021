package com.en.celia.OOP;

public class Dog extends Pet implements Pets{
    public Dog(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void play() {
        System.out.println("catelusul alearga in curte");
    }
}
