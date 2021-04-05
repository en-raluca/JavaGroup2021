package com.en.cristian.oop.problema3;

import com.en.cristian.oop.ObjectManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("------------------------problema3-------------------------------------------------------");
//        Animal animal1=new Animal("Urs", "grizzly");
//        System.out.println(animal1.toString());
//        Bird bird1 = new Bird("Acvila", "rapitoare");
//        bird1.makeSound();
        ObjectManager manager=new ObjectManager();

        System.out.println("ANIMALS");
        List<Animal> animalList = new ArrayList<Animal>();
        Animal cat1= new Animal("Suzi","pisica de casa");
        Animal cat2= new Animal("Puma","pisica salbatica");
        Animal dog1= new Cat2("Bruno","Beagle");
        Animal dog2= new Cat2("Azorel","Maidanez");
        Animal bird1= new Cat2("Acvila","rapitoare");
        Animal bird2= new Cat2("Randunica","migratoare");

        animalList.add(0,cat1);
        animalList.add(1,dog1);
        animalList.add(2,bird1);
        animalList.add(3,cat2);
        animalList.add(4,dog2);
        animalList.add(5,bird2);

        String categorie1=manager.findAnimalNameByCategory(animalList, "pisica de casa");
        System.out.println(categorie1);
        String categorie2=manager.findAnimalNameByCategory(animalList, "Maidanez");
        System.out.println(categorie2);
        String categorie3=manager.findAnimalNameByCategory(animalList, "pisica salbatica");
        System.out.println(categorie3);
        String categorie4=manager.findAnimalNameByCategory( animalList,"migratoare");
        System.out.println(categorie4);
        String categorie5=manager.findAnimalNameByCategory( animalList,"Beagle");
        System.out.println(categorie5);
    }
}
