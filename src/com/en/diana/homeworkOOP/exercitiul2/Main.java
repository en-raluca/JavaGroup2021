package com.en.diana.homeworkOOP.exercitiul2;

import com.en.diana.homeworkOOP.exercitiul6.ObjectManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Fish pastrav = new Fish("Pastrav", "de Apuseni");
//        Parrot papagal = new Parrot("Papagal", "perus");
//        pastrav.getRasa();
//        pastrav.setRasa("de munte");
//        System.out.println(pastrav);
//        System.out.println(papagal);
//        papagal.play();

        // exercitiul 3 Collections
        /*- verifica daca exista in lista de animale un animal de o anumita rasa data ca parametru
        public boolean searchPetByBreed(List<Pet> petList, String breed)*/
        //Construire obiecte tip Pet
        Pet papagal = new Parrot("Papagal", "Perus");
        Pet catel = new Dog("Caine", "Labrador");
        Pet pisica = new Cat("pisica", "Persana");
        //Creare lista de obieste tip Pet
        List<Pet> petList = new ArrayList<Pet>();
        petList.add(0, papagal);
        petList.add(1, catel);
        petList.add(2, pisica);
        ObjectManager manager = new ObjectManager();
        boolean rezultat = manager.searchPetByBreed(petList, "Labrador");
        System.out.println(rezultat);
    }
}
