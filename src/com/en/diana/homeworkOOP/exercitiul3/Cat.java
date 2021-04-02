package com.en.diana.homeworkOOP.exercitiul3;

public class Cat extends Animal implements Comportament {
    public Cat(String nume, String categorie) {
        super(nume, categorie);
    }


    public void makeSound() {
        System.out.println("miau-miau");
    }
}
