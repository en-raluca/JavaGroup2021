package com.en.elena.collections.animals;

import com.en.elena.practiceoop.pb2.Pet;

public class Cat extends Pet {

    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void play() {
        System.out.println("pisica toarce");
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
