package com.en.cristian.oop.problema2;

import com.en.cristian.oop.ObjectManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("-------------------------------problema2------------------------------------------------");
//        Cat cat1 = new Cat("Suzi", "siameza");
//        cat1.play();
//        Cat cat2 = new Cat("Zina", "persana");
//        System.out.println("Cat " + cat2 + "!");
//        Dog dog1 = new Dog("Grivei", "maidanez");
//        dog1.play();
//        Fish fish1 = new Fish("Figo", "obonus niger");
//        System.out.println(fish1);
//        Parrot parrot1 = new Parrot("Ricci", "Sulfur galerita");
//        parrot1.play();
        ObjectManager manager = new ObjectManager();

        List<Pet> petList = new ArrayList<Pet>();
        System.out.println("PETS");
        Pet cat= new Pet("Zina", "persana");
        Pet dog= new Pet("Bizu", "ciobanesc german");
        Pet fish= new Pet("Nemo", "calcan");
        Pet parrot= new Pet("Rico","perusi");

        petList.add(0,cat);
        petList.add(1,dog);
        petList.add(2,fish);
        petList.add(3,parrot);

        boolean breed1=manager.searchPetByBreed(petList, "persana");
        System.out.println(breed1);
        boolean breed2=manager.searchPetByBreed(petList, "ciobanesc german");
        System.out.println(breed2);
        boolean breed3=manager.searchPetByBreed(petList, "pastrav");
        System.out.println(breed3);
        boolean breed4=manager.searchPetByBreed(petList, "perusi");
        System.out.println(breed4);
    }
}
