package com.en.elena.collections.animals;

import com.en.elena.practiceoop.pb2.Pet;

public class Fish extends Pet {
    public Fish(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void play() {
        System.out.println("pestele inoata in acvariu");
    }

    @Override
    public String toString() {
        return "Fish{}";
    }
}
