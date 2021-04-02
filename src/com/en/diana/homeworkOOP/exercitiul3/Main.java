package com.en.diana.homeworkOOP.exercitiul3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("pisica", "pet");
        System.out.println(animal);
        Dog catel = new Dog("Skippi", "pet");
        catel.makeSound();
        System.out.println("Catelul " + catel.getNume() + " este din categoria " + catel.getCategorie());
        Bird pasare = new Bird("Porumbel", "zburatoare");
        String pas = pasare.getNume();
        System.out.println(pas);
        pasare.setNume("Randunica");
        System.out.println(pasare.getNume());
    }
}
