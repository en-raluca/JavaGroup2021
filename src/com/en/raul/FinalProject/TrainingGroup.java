package com.en.raul.FinalProject;

import java.util.Date;
import java.util.List;

public class TrainingGroup {
    int id;
    Date startDate;
    Date endDate;
    com.company.Training training;
    Trainer trainer;
    List<com.company.Employee> employeeList;

    public TrainingGroup(int id, Date startDate, Date endDate, com.company.Training training, Trainer trainer, List<com.company.Employee> employeeList) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.training = training;
        this.trainer = trainer;
        this.employeeList = employeeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(com.company.Training training) {
        this.training = training;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<com.company.Employee> employeeList) {
        this.employeeList = employeeList;
    }



    @Override
    public String toString() {
        return "TrainingGroup{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", training=" + training +
                ", trainer=" + trainer +
                ", employeeList=" + employeeList +
                '}';
    }
}
