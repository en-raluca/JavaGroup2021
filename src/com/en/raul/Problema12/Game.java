package com.en.raul.Problema12;

public class Game implements HowToPlay{
    String titlu;

    public Game(String titlu) {
        this.titlu = titlu;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }


    @Override
    public void howToPlay() {
        System.out.println("Jocul este" + titlu);
    }

    @Override
    public String toString() {
        return "Game{" +
                "titlu='" + titlu + '\'' +
                '}';
    }
}
