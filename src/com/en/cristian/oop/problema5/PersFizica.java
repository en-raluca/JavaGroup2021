package com.en.cristian.oop.problema5;

public class PersFizica extends Persoana{
    private long cnp;
    private String domiciliu;

    public PersFizica(String nume, String prenume, long cnp, String domiciliu) {
        super(nume, prenume);
        this.cnp = cnp;
        this.domiciliu = domiciliu;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
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
