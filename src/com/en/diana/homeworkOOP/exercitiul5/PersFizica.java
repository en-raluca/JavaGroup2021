package com.en.diana.homeworkOOP.exercitiul5;


public class PersFizica extends Persoana {
    private String cnp;
    private String domiciliu;

    public PersFizica(String nume, String prenume, String cnp, String domiciliu) {
        super(nume, prenume);
        this.cnp = cnp;
        this.domiciliu = domiciliu;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getDomiciliu() {
        return domiciliu;
    }

    public void setDomiciliu(String domiciliu) {
        this.domiciliu = domiciliu;
    }

    @Override
    public void showPersonDetails() {
        super.showPersonDetails();
    }
}

