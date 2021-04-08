package com.en.cristian.oop.map;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int persID;


    public Person(String firstName, String lastName, int age, int persID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.persID = persID;
    }

    public int getPersID() {
        return persID;
    }

    public void setPersID(int persID) {
        this.persID = persID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        Person pers = (Person) o;
        if (this.persID == pers.getPersID()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
