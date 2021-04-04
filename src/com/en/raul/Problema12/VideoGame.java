package com.en.raul.Problema12;

public class VideoGame extends Game implements HowToPlay{
    String producator;

    public VideoGame(String titlu, String producator) {
        super(titlu);
        this.producator = producator;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    @Override
    public void howToPlay() {
        System.out.println("You will need a pc or console to play" + titlu + " by " + producator);
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "titlu='" + titlu + '\'' +
                ", producator='" + producator + '\'' +
                '}';
    }
}
