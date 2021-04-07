package com.en.diana.project;

public abstract class EmployeeTrainer extends Person implements Trainer{
    public EmployeeTrainer(int id, String cnp, String firstName, String lastName, String email, String phoneNr) {
        super(id, cnp, firstName, lastName, email, phoneNr);
    }
//    public  double calculateTrainerRenumeration(TrainingGroup){}

}
