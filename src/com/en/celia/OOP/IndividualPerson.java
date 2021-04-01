package com.en.celia.OOP;

public class IndividualPerson extends Person {
    private String cnp;
    private String domiciliu;

    public IndividualPerson(String firstName, String lastName, String cnp, String domiciliu) {
        super(firstName, lastName);
        this.cnp = cnp;
        this.domiciliu = domiciliu;
    }

    public String getCnp() {

        return cnp;
    }

    public String getDomiciliu() {

        return domiciliu;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setDomiciliu(String domiciliu) {
        this.domiciliu = domiciliu;
    }

    @Override
    public void showPersonDetails() {
        super.showPersonDetails();
        System.out.println("Are cnp: " + cnp + " si domiciliul " + domiciliu);
    }
}
