package com.en.cristian.oop.problema2;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------problema2------------------------------------------------");
        Cat cat1 = new Cat("Suzi", "siameza");
        cat1.play();
        Cat cat2 = new Cat("Zina", "persana");
        System.out.println("Cat " + cat2 + "!");
        Dog dog1 = new Dog("Grivei", "maidanez");
        dog1.play();
        Fish fish1 = new Fish("Figo", "obonus niger");
        System.out.println(fish1);
        Parrot parrot1 = new Parrot("Ricci", "Sulfur galerita");
        parrot1.play();
    }
}
