package com.en.raul.FinalProject;

public class ExternalTrainer extends Person implements Trainer{
    String professionalDescription;
    String link;
    double ammountPerHour;

    public ExternalTrainer(int id, String cnp, String firstName, String lastName, String professionalDescription, String link, double ammountPerHour) {
        super(id, cnp, firstName, lastName);
        this.professionalDescription = professionalDescription;
        this.link = link;
        this.ammountPerHour = ammountPerHour;
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

    public double getAmmountPerHour() {
        return ammountPerHour;
    }

    public void setAmmountPerHour(double ammountPerHour) {
        this.ammountPerHour = ammountPerHour;
    }

    @Override
    public double calculateTrainerRemuneration(com.company.TrainingGroup trainingGroup) {
        return 0;
    }

    @Override
    public String toString() {
        return "ExternalTrainer{" +
                "professionalDescription='" + professionalDescription + '\'' +
                ", link='" + link + '\'' +
                ", ammountPerHour=" + ammountPerHour +
                ", id=" + id +
                ", cnp='" + cnp + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
