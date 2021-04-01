package com.en.andrei.oop.problem2;

/**
 * Created by atpop on 01 Apr 2021
 */

public class Main {

    public static void main(String[] args) {

        Pet pisica = new Cat("Boby", "Persian");
        pisica.play();

        Pet caine = new Dog("Rex", "Bulldog");
        caine.play();

        Fish peste = new Fish("Doby", "Auriu");
        peste.setNume("Milfred");
        System.out.println("Noul nume al pestelui este: " + peste.getNume());
        peste.play();
    }
}
