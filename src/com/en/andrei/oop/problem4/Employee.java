package com.en.andrei.oop.problem4;

/**
 * Created by atpop on 31 Mar 2021
 */

public class Employee {

    private String name;
    private String address;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public double calculatePay(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
