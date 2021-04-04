package com.en.diana.homeworkOOP.exercitiul5;

public class Main {
    public static void main(String[] args) {
        PersFizica person = new PersFizica("Popescu", "Maria", 290123456, "Cluj-Napoca");
        PersoanaJuridica juridic = new PersoanaJuridica("JYSK", 5678, "Bucuresti");
        System.out.println(person.toString());
        System.out.println("cnp-ul pentru " + person.getPrenume() + " est " + person.getCnp());
        juridic.setAdresaFirma("Baia Mare");
        System.out.println(juridic.getAdresaFirma());
        juridic.setCuiFirma(8907);
        System.out.println(juridic.getCuiFirma());
    }
}
