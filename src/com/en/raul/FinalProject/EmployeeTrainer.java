package com.en.raul.FinalProject;

public class EmployeeTrainer extends com.company.Employee implements Trainer{

    public EmployeeTrainer(int id, String cnp, String firstName, String lastName, int employeeId, String jobTitle, com.company.Location workLocation) {
        super(id, cnp, firstName, lastName, employeeId, jobTitle, workLocation);
    }

    @Override
    public double calculateTrainerRemuneration(com.company.TrainingGroup trainingGroup) {
        return 0;
    }

    @Override
    public String toString() {
        return "EmployeeTrainer{" +
                "employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", workLocation=" + workLocation +
                ", id=" + id +
                ", cnp='" + cnp + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
