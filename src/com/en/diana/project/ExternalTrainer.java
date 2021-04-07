package com.en.diana.project;

public abstract class ExternalTrainer extends Person implements Trainer{
    private String professionalDescription;
    private String link;
    private double amountPerHour;

    public ExternalTrainer(int id, String cnp, String firstName, String lastName, String email, String phoneNr,
                           String professionalDescription, String link, double amountPerHour) {
        super(id, cnp, firstName, lastName, email, phoneNr);
        this.professionalDescription = professionalDescription;
        this.link = link;
        this.amountPerHour = amountPerHour;
    }

    public String getProfessionalDescription() {
        return professionalDescription;
    }

    public void setProfessionalDescription(String professionalDescription) {
        this.professionalDescription = professionalDescription;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public double getAmountPerHour() {
        return amountPerHour;
    }

    public void setAmountPerHour(double amountPerHour) {
        this.amountPerHour = amountPerHour;
    }



    @Override
    public String toString() {
        return "ExternalTrainer{" +
                "professionalDescription='" + professionalDescription + '\'' +
                ", link='" + link + '\'' +
                ", amountPerHour=" + amountPerHour +
                '}';
    }

}
