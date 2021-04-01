package com.en.andrada.Tema3.ex2;

public class Cat extends Pet{
    private int nrPui;
    public Cat (String nume, String rasa, int nrPui){
        super(nume,rasa);
        this.nrPui=nrPui;
    }

    public void setNrPui(int nrPui) {
        this.nrPui = nrPui;
    }

    public int getNrPui() {
        return nrPui;
    }

    @Override
    public void play(){
        System.out.println(getNume()+" toarce");
    }
}
