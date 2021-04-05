package com.en.diana.homeworkOOP.exercitiul5;


public class PersoanaJuridica extends Persoana {
    private String companie;
    private String cuiFirma;
    private String adresaFirma;


    public PersoanaJuridica(String nume, String prenume, String companie, String cuiFirma, String adresaFirma) {
        super(nume, prenume);
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

    public String getCuiFirma() {
        return cuiFirma;
    }

    public void setCuiFirma(String cuiFirma) {
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

