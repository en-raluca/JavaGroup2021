package com.en.andrada.Tema3.ex2;

import java.util.ArrayList;
import java.util.List;

public class ObjectManager {
    public boolean searchPetByBreed(List<Pet> petList, String rasa){
        boolean result = false;
        for (Pet pet:petList){
            if (pet.getRasa().equals(rasa)){
                result = true;
            }
        }
        return result;
    }
}
