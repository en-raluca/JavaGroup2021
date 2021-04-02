package com.en.diana.homeworkOOP.exercitiul2;

public class Main {
    public static void main(String[] args) {
        Fish pastrav = new Fish("Pastrav", "de Apuseni");
        Parrot papagal = new Parrot("Papagal", "perus");
        pastrav.getRasa();
        pastrav.setRasa("de munte");
        System.out.println(pastrav);
        System.out.println(papagal);
        papagal.play();
    }
}
