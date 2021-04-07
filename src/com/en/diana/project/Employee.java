package com.en.diana.project;

import java.util.Date;

public class Employee extends Person{
    private int employeeId;
    private Location workLocation;
    private String jobTitle;
    private boolean isLineManager;
    private boolean isCareerCoach;
    private Date enrollCompanyDate;
    private Date leaveCompanyDate;


    public Employee(int id, String cnp, String firstName, String lastName, String email, String phoneNr,
                    Date dateOfBirth, Address address, int employeeId, Location workLocation, String jobTitle,
                    boolean isLineManager, boolean isCareerCoach, Date enrollCompanyDate) {
        super(id, cnp, firstName, lastName, email, phoneNr, dateOfBirth, address);
        this.employeeId = employeeId;
        this.workLocation = workLocation;
        this.jobTitle = jobTitle;
        this.isLineManager = isLineManager;
        this.isCareerCoach = isCareerCoach;
        this.enrollCompanyDate = enrollCompanyDate;
        this.leaveCompanyDate = leaveCompanyDate;
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

    public Date getEnrollCompanyDate() {
        return enrollCompanyDate;
    }

    public void setEnrollCompanyDate(Date enrollCompanyDate) {
        this.enrollCompanyDate = enrollCompanyDate;
    }

    public Date getLeaveCompanyDate() {
        return leaveCompanyDate;
    }

    public void setLeaveCompanyDate(Date leaveCompanyDate) {
        this.leaveCompanyDate = leaveCompanyDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", workLocation=" + workLocation +
                ", jobTitle='" + jobTitle + '\'' +
                ", isLineManager=" + isLineManager +
                ", isCareerCoach=" + isCareerCoach +
                ", enrollCompanyDate=" + enrollCompanyDate +
                ", leaveCompanyDate=" + leaveCompanyDate +
                '}';
    }
}
