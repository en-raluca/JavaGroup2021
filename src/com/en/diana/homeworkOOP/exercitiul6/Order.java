package com.en.diana.homeworkOOP.exercitiul6;

import com.en.diana.homeworkOOP.exercitiul10.Person;

public class Order {
    private String id;
    private Produs produs;
    private Person person;

    public Order(String id, Produs produs, Person person) {
        this.id = id;
        this.produs = produs;
        this.person = person;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Produs getProdus() {
        return produs;
    }

    public void setProdus(Produs produs) {
        this.produs = produs;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        return 31 * id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        Order order = (Order) o;
        if (this.id == order.getId()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", produs=" + produs +
                ", person=" + person +
                '}';
    }
}
