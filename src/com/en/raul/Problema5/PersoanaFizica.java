package com.en.raul.Problema5;

public class PersoanaFizica extends Persoana{
    String cnp;
    String domiciliu;

    public PersoanaFizica(String nume, String prenume, String cnp, String domiciliu) {
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
    public void showPersonalDetails(){
        System.out.println("Persoana fizica cu numele "+nume+ " si prenumele "+prenume+" cu CNP:"+cnp+" domiciliat in: "+domiciliu);
    }
}
