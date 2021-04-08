package com.en.celia.Proiect;

public class ExternalTrainer implements Trainer{
    private String professionalDescription;
    private String link;
    private double amountPerHour;

    public ExternalTrainer(String professionalDescription, String link, double amountPerHour) {
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
    public double calculateTrainerRemuneration(TrainingGroup trainingGroup) {
        return 0;
    }
}
