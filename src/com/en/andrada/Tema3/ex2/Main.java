package com.en.andrada.Tema3.ex2;

public class Main {
    public static void main(String[] args) {
        Pet animal = new Pet("nume", "rasa");
        System.out.println("Orice animal are un " + animal.getNume() + " si o " + animal.getRasa());
        Cat pisica = new Cat("Daisy", "Scottish Fold", 5);
        System.out.println(pisica.getNume() + " este o pisica din rasa " + pisica.getRasa() + " si are " + pisica.getNrPui() + " pui.");
        pisica.play();
        Fish peste = new Fish("Max", "anemone", "aurii");
        System.out.println(peste.getNume() + " este un peste din rasa " + peste.getRasa() + " si are solzii " + peste.getCuloareSolzi());
        peste.play();
        Dog catel = new Dog("Bubu", "pechinez", "maro");
        System.out.println("Cainele meu este " + catel.getNume() + ",este din rasa " + catel.getRasa() + " si are culoarea " + catel.getCuloare());
        catel.play();
        Parrot papagal = new Parrot("Coco", "perus", true);
        System.out.println("Papagalul " + papagal.getNume() + " este un " + papagal.getRasa() + " si poate vorbi - " + papagal.isVorbeste());
        papagal.play();
    }
}
