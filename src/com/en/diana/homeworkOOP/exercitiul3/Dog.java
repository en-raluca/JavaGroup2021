package com.en.diana.homeworkOOP.exercitiul3;

public class Dog extends Animal implements Comportament {
    public Dog(String nume, String categorie) {
        super(nume, categorie);
    }


    public void makeSound() {
        System.out.println("ham-ham");
    }
}

