package com.myproject.service;

/**
 * Created by atpop on 07 Apr 2021
 */

public enum Location {

    UBC("UBC"),
    UBC1("UBC1"),
    PBC("PBC"),
    CBC("CBC"),
    IBC("IBC");

    private String name;

    Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
