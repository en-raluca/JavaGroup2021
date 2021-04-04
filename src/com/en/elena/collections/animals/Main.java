package com.en.elena.collections.animals;

import com.en.elena.practiceoop.pb2.Cat;
import com.en.elena.practiceoop.pb2.Dog;
import com.en.elena.practiceoop.pb2.Fish;
import com.en.elena.practiceoop.pb2.Parrot;

public class Main {
    public static void main(String[] args) {
        com.en.elena.practiceoop.pb2.Cat cat1 = new com.en.elena.practiceoop.pb2.Cat("Tom", "Sfinx");
        com.en.elena.practiceoop.pb2.Cat cat2 = new Cat("Albert", "Siamez");
        com.en.elena.practiceoop.pb2.Dog dog1 = new com.en.elena.practiceoop.pb2.Dog("Ella", "Bichon");
        com.en.elena.practiceoop.pb2.Dog dog2 = new Dog("Blacky", "Labrador");
        Parrot parrot1 = new Parrot("Paco", "Nimfa");
        Parrot parrot2 = new Parrot("Lori", "Loriket");
        com.en.elena.practiceoop.pb2.Fish fish1 = new com.en.elena.practiceoop.pb2.Fish("Mircea", "Pastrav");
        com.en.elena.practiceoop.pb2.Fish fish2 = new Fish("Adda", "Betta");

        System.out.println("Cat " + cat1.getName().toString());
        cat1.setName("Bobi");
        System.out.println(cat2.getName().toString() + " is plaing with " + cat1.getName().toString());
        dog1.play();
        System.out.println(dog1.getName().toString());
        dog1.setName("Bibi");
        System.out.println("New name for Ella is " + dog2.getName().toString());
        dog2.play();
        System.out.println(dog2.getName().toString() + " is a cute dog");
        parrot1.play();
        System.out.println("We present you " + parrot1.getName().toString() + " parrot.");
        parrot2.setName("Blue");
        System.out.println("The parrot name is " + parrot2.getName().toString());
        fish1.play();
        System.out.println("Fish 1 " + fish1.getName().toString() + " fish 2 " + fish2.getName().toString());



    }
}
