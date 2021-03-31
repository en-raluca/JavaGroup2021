package com.en.andrei.oop.problem14;

/**
 * Created by atpop on 31 Mar 2021
 */

public class EmailContact extends Contact {

    private String email;

    public EmailContact(String nume, String prenume, String email) {
        super(nume, prenume);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Email contact: " + email);
    }
}
