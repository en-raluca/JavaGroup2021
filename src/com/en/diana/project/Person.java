package com.en.diana.project;


import java.util.Date;

public class Person {
    private int id;
    private String cnp;
    private String firstName;
    private String LastName;
    private String email;
    private String phoneNr;
    private Date dateOfBirth;
    private Address address;

    public Person(int id, String cnp, String firstName, String lastName, String email, String phoneNr, Date dateOfBirth, Address address) {
        this.id = id;
        this.cnp = cnp;
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
        this.phoneNr = phoneNr;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", cnp='" + cnp + '\'' +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNr='" + phoneNr + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                '}';
    }

    @Override
    public int hashCode() {
        return 31 * id;
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        if (this.id == person.getId()) {
            return true;
        }
        return false;
    }

}
