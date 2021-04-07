package com.en.diana.homeworkOOP.exercitiul10;

public class Person {
    private int id;
    private String nume;
    private String prenume;
    private String adresa;

    public Person(int id, String nume, String prenume, String adresa) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void showPersonDetails() {
    }

    @Override
    public int hashCode() {
        return 31 * id;
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        if (this.id == person.getId()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Numele este " + nume + ", prenumele " + prenume + " si adresa " + adresa;
    }

}
