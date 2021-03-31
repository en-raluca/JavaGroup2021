package com.en.andrei.oop.problem14;

/**
 * Created by atpop on 31 Mar 2021
 */

public class Contact {

    private String nume;
    private String prenume;

    public Contact(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
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

    public void sendMessage() {
        System.out.println(nume + prenume);
    }
}
