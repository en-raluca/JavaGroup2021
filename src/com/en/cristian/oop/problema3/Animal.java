package com.en.cristian.oop.problema3;

public class Animal {
    private String nume;
    private String categorie;

    public Animal(String nume, String categorie) {
        this.nume = nume;
        this.categorie = categorie;
    }

    public void makeSound() {
        System.out.println("Fiecare animal are un nume: " + nume + " si face parte dintr-o categorie: " + categorie);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    @Override
    public String toString() {
        return "nume " + nume + ", categorie " + categorie;

    }
}
