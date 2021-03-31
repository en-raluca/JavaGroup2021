package com.en.raul.Problema1;

public class Plant {
    String name;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saySomethingSpecialAbout(){
        System.out.println("Aceasta planta este: "+name);
    }
}
