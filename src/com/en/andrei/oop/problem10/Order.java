package com.en.andrei.oop.problem10;

/**
 * Created by atpop on 05 Apr 2021
 */

public class Order {

    private String id;
    private Product produs;
    private Person Person;

    public Order(String id, Product produs, Person Person) {
        this.id = id;
        this.produs = produs;
        this.Person = Person;
    }

    public String getId() {
        return id;
    }

    public Product getProdus() {
        return produs;
    }

    public Person getPerson() {
        return Person;
    }

    @Override
    public int hashCode() {
        return 31 * id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        Order order = (Order) o;
        if (this.id.equals(order.getId())) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", produs=" + produs +
                ", Person=" + Person +
                '}';
    }
}
