package com.en.andrei.oop.problem14;

/**
 * Created by atpop on 31 Mar 2021
 */

public class PhoneContact extends Contact {

    private String telefon;

    public PhoneContact(String nume, String prenume, String telefon) {
        super(nume, prenume);
        this.telefon = telefon;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Phone contact: " + telefon);
    }
}
