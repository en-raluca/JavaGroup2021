package com.en.diana.Homework3OOP;

/*2)parent class Pet: nume, rasa
                       void play() - suprascrieti aceasta metoda in subclase
    child classes - Cat:  play(){sout("pisica toarce");}
                   - Fish: play(){sout("pestele inoata in acvariu");}
                   - Dog:  play(){sout("catelul alearga in curte");}
                    - Parrot: play(){sout("papagalul canta");}*/
public class Pet {
    private String nume;
    private String rasa;

    public Pet(String nume, String rasa) {
        this.nume = nume;
        this.rasa = rasa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void play() {
        System.out.println("Animalele fac zgomot!");
    }

    @Override
    public String toString() {
        return "Numele: " + nume + ", rasa: " + rasa;
    }
}
