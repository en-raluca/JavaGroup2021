package com.en.celia.Proiect;

public class EmployeeTrainer extends Employee implements Trainer{
    public EmployeeTrainer(int id, String cnp, String firstName, String lastName, int employeeId, Location workLocation, String jobTitle){
        super(id, cnp, firstName, lastName, employeeId,workLocation,jobTitle);
    }

    @Override
    public double calculateTrainerRemuneration(TrainingGroup trainingGroup){
        return 0;
    }


}
