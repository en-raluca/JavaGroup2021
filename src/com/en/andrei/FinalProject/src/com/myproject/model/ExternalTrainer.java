package com.myproject.model;

import com.myproject.service.Address;
import com.myproject.service.TrainingGroup;

import java.util.Date;

/**
 * Created by atpop on 07 Apr 2021
 */

public class ExternalTrainer extends Person implements Trainer {

    private String professionalDescription;
    private String link;
    private double amountPerHour;

    public ExternalTrainer(int id, String cnp, String firstName, String lastName, String email,
                           String phoneNr, Date dateOfBirth, Address address, String professionalDescription,
                           String link, double amountPerHour) {
        super(id, cnp, firstName, lastName, email, phoneNr, dateOfBirth, address);
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

    @Override
    public String toString() {
        return "ExternalTrainer{" +
                "professionalDescription='" + professionalDescription + '\'' +
                ", link='" + link + '\'' +
                ", amountPerHour=" + amountPerHour +
                '}';
    }
}
