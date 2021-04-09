package com.myproject.service;

import com.myproject.model.Employee;
import com.myproject.model.Trainer;

import java.util.Date;
import java.util.List;

/**
 * Created by atpop on 07 Apr 2021
 */

public class TrainingGroup {

    private int id;
    private Date startDate;
    private Date endDate;
    private Location location;
    private Training training;
    public Trainer trainer;
    private List<Employee> employeeList;

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public TrainingGroup(int id, Date startDate, Date endDate, Location location,
                         Training training, Trainer trainer, List<Employee> employeeList) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }



    @Override
    public String toString() {
        return "TrainingGroup{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", location=" + location +
                ", training=" + training +
                ", employeeList=" + employeeList +
                '}';
    }
}
