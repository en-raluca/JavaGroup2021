package com.en.andrei.oop.problem12;

/**
 * Created by atpop on 05 Apr 2021
 */

public class VideoGame extends Game {
    private String producator;

    public VideoGame(String title, String producator) {
        super(title);
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
        System.out.println("This is how you play a video game.");
    }
}
