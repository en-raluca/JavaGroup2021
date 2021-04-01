package com.en.andrada.Tema3.ex1;

public class Main {
    public static void main(String[] args){
        Plant planta = new Plant("bonzai");
        System.out.println("Planta aleasa este "+planta.getName());
        Flower floare = new Flower("orhidee","alba",3);
        System.out.println("Floarea aleasa este "+floare.getName()+"are culoarea "+floare.getCuloare()+" si are "+floare.getNrPetale() +" petale.");
        floare.setCuloare("roz");
        System.out.println("Floarea aleasa este "+floare.getName()+"are culoarea "+floare.getCuloare()+" si are "+floare.getNrPetale()+" petale.");
        floare.saySomethingSpecialAbout();
        Tree copac = new Tree("salcam",1.5, 10);
        System.out.println("Copacul ales este "+copac.getName()+" are inaltimea "+copac.getHeight()+" metri "+" si are "+copac.getAge()+" ani.");
        copac.setAge(20);
        System.out.println("Copacul ales este "+copac.getName()+" are inaltimea "+copac.getHeight()+" metri "+" si are "+copac.getAge()+" ani.");
        copac.saySomethingSpecialAbout();
    }
}
