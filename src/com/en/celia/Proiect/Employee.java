package com.en.celia.Proiect;

public class Employee extends Person{
    private int employeeId;
    private Location workLocation;
    private String jobTitle;

    public Employee(int id, String cnp, String firstName, String lastName, int employeeId, Location workLocation, String jobTitle){
        super(id, cnp, firstName, lastName);
        this.employeeId = employeeId;
        this.workLocation = workLocation;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Location getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(Location workLocation) {
        this.workLocation = workLocation;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
