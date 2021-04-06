package com.en.andrei.oop.problem10;

/**
 * Created by atpop on 01 Apr 2021
 */

public enum City {

    CLUJ("Cluj-Napoca"),
    BUCURESTI("Bucuresti"),
    BISTRITA_NASAUD("Bistrita-Nasaud"),
    IASI("Iasi");

    private String name;

    City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
