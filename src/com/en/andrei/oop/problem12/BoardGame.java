package com.en.andrei.oop.problem12;

/**
 * Created by atpop on 05 Apr 2021
 */

public class BoardGame extends Game {

    private int nrOfPlayers;
    private double averagePlayTime;

    public BoardGame(String title, int nrOfPlayers, double averagePlayTime) {
        super(title);
        this.nrOfPlayers = nrOfPlayers;
        this.averagePlayTime = averagePlayTime;
    }

    public int getNrOfPlayers() {
        return nrOfPlayers;
    }

    public void setNrOfPlayers(int nrOfPlayers) {
        this.nrOfPlayers = nrOfPlayers;
    }

    public double getAveragePlayTime() {
        return averagePlayTime;
    }

    public void setAveragePlayTime(double averagePlayTime) {
        this.averagePlayTime = averagePlayTime;
    }

    @Override
    public void howToPlay() {
        System.out.println("This is how you play a board game");
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "nrOfPlayers=" + nrOfPlayers +
                ", averagePlayTime=" + averagePlayTime +
                '}';
    }
}
