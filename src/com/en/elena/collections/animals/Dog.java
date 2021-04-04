package com.en.elena.collections.animals;

import com.en.elena.practiceoop.pb2.Pet;

public class Dog extends Pet {
    public Dog(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void play() {
        System.out.println("catelul alearga in curte");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
