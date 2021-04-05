package com.en.andrei.oop.problem12;

/**
 * Created by atpop on 05 Apr 2021
 */

public abstract class Game {

    private String title;

    public Game(String title) {
        this.title = title;
    }

    public Game() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void howToPlay();

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                '}';
    }
}
