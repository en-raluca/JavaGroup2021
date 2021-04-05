package com.en.diana.homeworkOOP.exercitiul3;

import com.en.diana.homeworkOOP.exercitiul6.ObjectManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("pisica", "pet");
//        System.out.println(animal);
//        Dog catel = new Dog("Skippi", "pet");
//        catel.makeSound();
//        System.out.println("Catelul " + catel.getNume() + " este din categoria " + catel.getCategorie());
//        Bird pasare = new Bird("Porumbel", "zburatoare");
//        String pas = pasare.getNume();
//        System.out.println(pas);
//        pasare.setNume("Randunica");
//        System.out.println(pasare.getNume());

        //exercitiul 4 Collections
        /*- cauta in lista de animale un animal dintr-o anumita categorie data ca parametru
        public String findAnimalNameByCategory(List<Animal> animalList, String category) */
        //Construire obiecte tip Animal
        Animal caine = new Dog("Skippi", "pet");
        Animal pasare = new Bird("Spark", "zburatoare");
        Animal pisicuta = new Cat("Pissi", "pet");
        //Creare lista de obieste tip Animal
        List<Animal> animalList = new ArrayList<Animal>();
        animalList.add(0, caine);
        animalList.add(1, pasare);
        animalList.add(2, pisicuta);
        ObjectManager manager = new ObjectManager();
        String rezult = manager.findAnimalNameByCategory(animalList, "pet");
        System.out.println(rezult);
    }
}
