package com.en.diana.project;

public class Employee {
    private int employeeId;
    private Location workLocation;
    private String jobTitle;
    private boolean isLineManager;
    private boolean isCareerCoach;

    public Employee(int employeeId, Location workLocation, String jobTitle, boolean isLineManager, boolean isCareerCoach) {
        this.employeeId = employeeId;
        this.workLocation = workLocation;
        this.jobTitle = jobTitle;
        this.isLineManager = isLineManager;
        this.isCareerCoach = isCareerCoach;
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

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", workLocation=" + workLocation +
                ", jobTitle='" + jobTitle + '\'' +
                ", isLineManager=" + isLineManager +
                ", isCareerCoach=" + isCareerCoach +
                '}';
    }
}
