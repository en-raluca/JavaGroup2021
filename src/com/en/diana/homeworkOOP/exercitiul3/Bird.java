package com.en.diana.homeworkOOP.exercitiul3;

public class Bird extends Animal implements Comportament {
    public Bird(String nume, String categorie) {
        super(nume, categorie);
    }


    public void makeSound() {
        System.out.println("cip-cirip");
    }
}
