package com.en.andrada.Tema3.ex6;

public class Order {
    private int id;
    private Produs produs;
    private Customer customer;

    public Order(int id, Produs produs, Customer customer){
        this.id=id;
        this.produs=produs;
        this.customer=customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produs getProdus() {
        return produs;
    }

    public void setProdus(Produs produs) {
        this.produs = produs;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @Override
    public int hashCode(){
        return id*31;
    }
    @Override
    public boolean equals(Object o){
        Order order = (Order) o;
        return this.id ==order.getId();
    }
    @Override
    public String toString(){
        return "Clientul " + customer.getName() + " a comandat produsul " + produs.getNume() + " cu id'ul "+ id;
    }
}
