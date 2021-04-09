package com.myproject.model;

import com.myproject.service.Address;
import com.myproject.service.Location;
import com.myproject.service.TrainingGroup;

import java.util.Date;

/**
 * Created by atpop on 07 Apr 2021
 */

public class EmployeeTrainer extends Employee implements Trainer {

    public EmployeeTrainer(int id, String cnp, String firstName, String lastName, String email,
                           String phoneNr, Date dateOfBirth, Address address, int employeeId,
                           Location workLocation, String jobTitle, boolean isLineManager, boolean isCareerCoach,
                           Date enrollCompanyDate, Date leaveCompanyDate) {
        super(id, cnp, firstName, lastName, email, phoneNr, dateOfBirth, address, employeeId, workLocation,
                jobTitle, isLineManager, isCareerCoach, enrollCompanyDate, leaveCompanyDate);
    }

    @Override
    public double calculateTrainerRemuneration(TrainingGroup trainingGroup) {
        return 0;
    }

    @Override
    public String toString() {
        return "EmployeeTrainer{}";
    }
}
