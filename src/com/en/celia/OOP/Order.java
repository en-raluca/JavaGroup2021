package com.en.celia.OOP;
public class Order {
    private String id;
    private Product produs;
    private Persoana persoana;

    public Order(String id, Product produs, Persoana persoana){
        this.id = id;
        this.produs = produs;
        this.persoana = persoana;
    }

    public String getId() {
        return id;
    }

    public Product getProdus() {
        return produs;
    }

    public Persoana getPersoana() {
        return persoana;
    }

    @Override
    public int hashCode(){
        return 31*id.hashCode();
    }

    @Override
    public boolean equals(Object o){
        Order order = (Order) o;
        if(this.id.equals(order.getId())){
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", produs=" + produs +
                ", persoana=" + persoana +
                '}';
    }

}
