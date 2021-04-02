package com.en.diana.homeworkOOP.exercitiul9;

public class Main {
    public static void main(String[] args) {
        Spiderman spiderman = new Spiderman("Spiderman", "spiderWeb", "red", "hand");
        Superman superman = new Superman("Superman", "fly", "blue", "strength",
                "body");
        Batman batman = new Batman("Batman", "money", "black", "batCave");
        String nameS = spiderman.getName();
        System.out.println(nameS);
        String power = superman.getPower();
        System.out.println(power);
        String launch = batman.getLaunchThePower();
        System.out.println(launch);
    }
}
