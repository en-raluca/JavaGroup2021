package com.en.raul.Problema12;

public class BoardGame extends Game implements HowToPlay {
    int nrOfPlayers;
    int averagePlayTime;

    public BoardGame(String titlu, int nrOfPlayers, int averagePlayTime) {
        super(titlu);
        this.nrOfPlayers = nrOfPlayers;
        this.averagePlayTime = averagePlayTime;
    }

    public int getNrOfPlayers() {
        return nrOfPlayers;
    }

    public void setNrOfPlayers(int nrOfPlayers) {
        this.nrOfPlayers = nrOfPlayers;
    }

    public int getAveragePlayTime() {
        return averagePlayTime;
    }

    public void setAveragePlayTime(int averagePlayTime) {
        this.averagePlayTime = averagePlayTime;
    }

    @Override
    public void howToPlay() {
        System.out.println("You will need " + nrOfPlayers + " number of players and it will have " + averagePlayTime + " average play time.");
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "nrOfPlayers=" + nrOfPlayers +
                ", averagePlayTime=" + averagePlayTime +
                ", titlu='" + titlu + '\'' +
                '}';
    }
}
