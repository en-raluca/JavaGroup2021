package com.en.diana.Homework3OOP;

/*6)parent class Produs: id, nume, pret
                        void applyDiscount(double discount) - suprascrieti aceasta metoda in subclase
    child classes  - ProdAlimentar: gramaj
                   - ProElectronic: model
                   - ProdAccesoriu: marime */

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
}
