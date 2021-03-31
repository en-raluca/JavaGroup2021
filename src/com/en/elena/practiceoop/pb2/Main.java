package com.en.elena.practiceoop.pb2;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", "Sfinx");
        Cat cat2 = new Cat("Albert", "Siamez");
        Dog dog1 = new Dog("Ella", "Bichon");
        Dog dog2 = new Dog("Blacky", "Labrador");
        Parrot parrot1 = new Parrot("Paco", "Nimfa");
        Parrot parrot2 = new Parrot("Lori", "Loriket");
        Fish fish1 = new Fish("Mircea", "Pastrav");
        Fish fish2 = new Fish("Adda", "Betta");

        cat1.play();
        cat1.getName();
        System.out.println("Pisica" + cat1);
        cat1.setName("Bobi");
        System.out.println(cat2 + " is plaing with " + cat1);
        cat2.play();
        System.out.println(dog1);
        dog1.getName();
        dog1.setName("Bibi");
        System.out.println("New name for Ella is " +dog2);
        dog2.play();
        System.out.println(dog2 + "is a cute dog");
        parrot1.getName();
        System.out.println("We present you " + parrot1 + "parrot.");
        parrot2.getName();
        parrot2.play();
        parrot2.setName("Blue");
        System.out.println("The parrot name is" + parrot2);
        fish1.getName();
        fish2.getName();
        System.out.println("Fish 1" + fish1 + "fish 2" + fish2);
        fish1.play();


    }
}
