package com.en.diana.homeworkOOP.exercitiul6;

import trainings.Person;
import trainings.Product;

import java.util.List;

public class ObjectManager {

    public boolean checkIfProductIsFree(Produs produs) {
        double pret = produs.getPret();
        boolean isFree = false;
        if (pret == 0) {
            isFree = true;
        }
        return isFree;
    }

    public String findProductById(List<Product> productList, String name) {
        String nameRez = null;
        for (Product p : productList) {
            if (p.getName().equals(name)) {
                nameRez = p.getCategorie();
            }
        }
        return nameRez;
    }

    public boolean getAgeOfPersonByNameAndLastName(List<Person> personList, String lastName) {
        boolean result = false;
        for (Person p : personList) {
            if (p.getFirstName().equals(lastName) && p.getLastName().equals(lastName)) {
                return true;
            }
        }
        return result;
    }
}
