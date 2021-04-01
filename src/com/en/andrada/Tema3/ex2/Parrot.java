package com.en.andrada.Tema3.ex2;

public class Parrot extends Pet {
    private boolean vorbeste;

    public Parrot(String nume,String rasa, boolean vorbeste){
        super(nume,rasa);
        this.vorbeste=vorbeste;
    }

    public void setVorbeste(boolean vorbeste) {
        this.vorbeste = vorbeste;
    }

    public boolean isVorbeste() {
        return vorbeste;
    }
    @Override
    public void play(){
        System.out.println(getNume()+" canta");
    }
}
