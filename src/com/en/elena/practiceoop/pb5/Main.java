package com.en.elena.practiceoop.pb5;

public class Main {
    public static void main(String[] args) {

        PersFizica pers1 = new PersFizica("Pop", "Andrei", "255655252565","Cluj");
        PersoanaJuridica pers2= new PersoanaJuridica("Lazar", "Irina", "Petrom", "456556", "Cluj");

        pers1.showPersonDetails();
        pers2.showPersonDetails();

    }
}
