package com.en.celia.OOP;

public class LegalEntity extends Person {
    private String companie;
    private String cuiFirma;
    private String adresaFirma;

    public LegalEntity(String firstName, String lastName, String companie, String cuiFirma, String adresaFirma) {
        super(firstName, lastName);
        this.companie = companie;
        this.cuiFirma = cuiFirma;
        this.adresaFirma = adresaFirma;
    }

    public String getCompanie() {
        return companie;
    }

    public String getCuiFirma() {
        return cuiFirma;
    }

    public String getAdresaFirma() {
        return adresaFirma;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public void setCuiFirma(String cuiFirma) {
        this.cuiFirma = cuiFirma;
    }

    public void setAdresaFirma(String adresaFirma) {
        this.adresaFirma = adresaFirma;
    }

    @Override
    public void showPersonDetails() {
        super.showPersonDetails();
        System.out.println("Face parte din compania: " + companie + " cui: " + cuiFirma + " si are adresa " + adresaFirma);
    }
}
