package com.en.diana.homeworkOOP.exercitiul6;

public abstract class Produs {
    private int id;
    private String nume;
    private double pret;

    public Produs(int id, String nume, double pret) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
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

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public abstract void applyDiscount(double discount);

    @Override
    public String toString() {
        return "Id: " + id + " nume: " + nume + " pret: " + pret;
    }

    @Override
    public boolean equals(Object o) {
        Produs produs = (Produs) o;
        return produs.getId() == id;
    }

    @Override
    public int hashCode() {
        return 31 * id;
    }
}
