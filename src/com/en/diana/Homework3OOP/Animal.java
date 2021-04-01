package com.en.diana.Homework3OOP;

/*3) parent class Animal: nume, categorie
                          void makeSound() - suprascrieti aceasta metoda in subclase
     child classes   - Cat2:  makeSound(){sout("miau-miau");}
                      - Dog2:  makeSound(){sout("ham-ham");}
                      - Bird: makeSound(){sout("cip-cirip");}*/

public class Animal {
    private String nume;
    private String categorie;

    public Animal(String nume, String categorie) {
        this.nume = nume;
        this.categorie = categorie;
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

    public void makeSound() {
    };

    @Override
    public String toString() {
        return "Numele: " + nume + " din catedoria: " + categorie;
    }

}
