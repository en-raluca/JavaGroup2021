package com.en.cristian.oop.problema3;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------problema3-------------------------------------------------------");
        Animal animal1=new Animal("Urs", "grizzly");
        System.out.println(animal1.toString());
        Bird bird1 = new Bird("Acvila", "rapitoare");
        bird1.makeSound();
    }
}
