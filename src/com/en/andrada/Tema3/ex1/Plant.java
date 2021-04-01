package com.en.andrada.Tema3.ex1;

public class Plant {
    private String name;
    public Plant (String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void saySomethingSpecialAbout(){
        System.out.println("Planta este un organism vegetal");
    }
}
