package com.en.raul.FinalProject;


public class Employee extends Person{
    int employeeId;
    String jobTitle;
    Location workLocation;
    boolean isLineManager;
    boolean isCareerCoach;

    public Employee(int id, String cnp, String firstName, String lastName, int employeeId, String jobTitle, Location workLocation, boolean isLineManager, boolean isCareerCoach) {
        super(id, cnp, firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.workLocation = workLocation;
        this.isLineManager = isLineManager;
        this.isCareerCoach = isCareerCoach;
    }

    public boolean isLineManager() {
        return isLineManager;
    }

    public void setLineManager(boolean lineManager) {
        isLineManager = lineManager;
    }

    public boolean isCareerCoach() {
        return isCareerCoach;
    }

    public void setCareerCoach(boolean careerCoach) {
        isCareerCoach = careerCoach;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Location getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(Location workLocation) {
        this.workLocation = workLocation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", workLocation=" + workLocation +
                '}';
    }
}
