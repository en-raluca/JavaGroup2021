package com.en.diana.project;

import java.util.Date;

public  class EmployeeTrainer extends Employee implements Trainer{
    public EmployeeTrainer(int id, String cnp, String firstName, String lastName, String email, String phoneNr, Date dateOfBirth, Address address, int employeeId, Location workLocation, String jobTitle, boolean isLineManager, boolean isCareerCoach, Date enrollCompanyDate) {
        super(id, cnp, firstName, lastName, email, phoneNr, dateOfBirth, address, employeeId, workLocation, jobTitle, isLineManager, isCareerCoach, enrollCompanyDate);
    }

    @Override
    public double calculateTrainerRenumeration(TrainingGroup trainingGroup) {
        return 0;
    }

}
