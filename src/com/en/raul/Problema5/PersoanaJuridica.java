package com.en.raul.Problema5;

public class PersoanaJuridica extends Persoana{
    String companie, adresaFirma,cuiFirma;

    public PersoanaJuridica(String nume, String prenume, String companie, String adresaFirma, String cuiFirma) {
        super(nume, prenume);
        this.companie = companie;
        this.adresaFirma = adresaFirma;
        this.cuiFirma = cuiFirma;
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public String getAdresaFirma() {
        return adresaFirma;
    }

    public void setAdresaFirma(String adresaFirma) {
        this.adresaFirma = adresaFirma;
    }

    public String  getCuiFirma() {
        return cuiFirma;
    }

    public void setCuiFirma(String  cuiFirma) {
        this.cuiFirma = cuiFirma;
    }

    @Override
    public void showPersonalDetails(){
        System.out.println("Persoana juridica cu numele: "+nume+" si prenumele "+prenume + " de la compania " +companie+" adresa "
                + adresaFirma + " cu CUI: "+cuiFirma);
    }

    @Override
    public String toString() {
        return "PersoanaJuridica{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", companie='" + companie + '\'' +
                ", adresaFirma='" + adresaFirma + '\'' +
                ", cuiFirma='" + cuiFirma + '\'' +
                '}';
    }
}
