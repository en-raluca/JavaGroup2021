package com.en.celia.OOP;

public class Cat extends Pet implements Pets{
    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    public String toString(){
        return "Flower name= " + this.getName() + " breed: " + getBreed();
    }
    @Override
    public void play() {
        System.out.println("pisica toarce");
    }
}
