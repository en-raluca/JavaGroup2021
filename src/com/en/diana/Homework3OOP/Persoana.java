package com.en.diana.Homework3OOP;

/*5)parent class Persoana: nume, prenume
                           void showPersonDetails() - suprascrieti aceasta metoda in subclase
    child classes  - PersFizica: cnp, domiciliu
                   - PersoanaJuridica: companie, cuiFirma, adresaFirma */

public class Persoana {
    private String nume;
    private String prenume;

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public Persoana() {
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

    public void showPersonDetails() {
    }

    @Override
    public String toString() {
        return "nume: " + nume + " prenume: " + prenume;
    }
}
