package com.en.diana.Homework3OOP;

public class PersoanaJuridica extends Persoana {
    private String companie;
    private int cuiFirma;
    private String adresaFirma;


    public PersoanaJuridica(String nume, String prenume, String companie, int cuiFirma, String adresaFirma) {
        super(nume, prenume);
        this.companie = companie;
        this.cuiFirma = cuiFirma;
        this.adresaFirma = adresaFirma;
    }

    public PersoanaJuridica(String companie, int cuiFirma, String adresaFirma) {
        this.companie = companie;
        this.cuiFirma = cuiFirma;
        this.adresaFirma = adresaFirma;
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public int getCuiFirma() {
        return cuiFirma;
    }

    public void setCuiFirma(int cuiFirma) {
        this.cuiFirma = cuiFirma;
    }

    public String getAdresaFirma() {
        return adresaFirma;
    }

    public void setAdresaFirma(String adresaFirma) {
        this.adresaFirma = adresaFirma;
    }

    @Override
    public void showPersonDetails() {
        super.showPersonDetails();
    }
}
