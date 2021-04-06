package com.en.andrei.oop.problem6;

import java.util.Objects;

/**
 * Created by atpop on 31 Mar 2021
 */

public class Produs {

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

    public void applyDiscount() {

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

    @Override
    public String toString() {
        return "Produs{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }
}
