package com.en.diana.Homework3OOP;

/* 1)parent class Plant: name
                          void saySomethingSpecialAbout() - suprascrieti aceasta metoda in subclase
      child classes - Flower: culoare, nrPetale, saySomethingSpecialAbout(){sout
                              ("Life is the flower for which love is the honey!");}
                     - Tree:   height, age,       saySomethingSpecialAbout()
                        {sout("There are a lot of trees at Botanical Garden!");} */
public class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saySomethingSpecialAbout() {
    }

    @Override
    public String toString() {
        return "name: " + name;
    }
}
