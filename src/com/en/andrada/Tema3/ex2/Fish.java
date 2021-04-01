package com.en.andrada.Tema3.ex2;

public class Fish extends Pet {
    private String culoareSolzi;

    public Fish(String nume,String rasa,String culoareSolzi){
        super(nume,rasa);
        this.culoareSolzi=culoareSolzi;
    }

    public void setCuloareSolzi(String culoareSolzi) {
        this.culoareSolzi = culoareSolzi;
    }

    public String getCuloareSolzi() {
        return culoareSolzi;
    }
    @Override
    public void play(){
        System.out.println(getNume()+" inoata in acvariu");
    }
}
