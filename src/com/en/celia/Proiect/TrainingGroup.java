package com.en.celia.Proiect;

import java.util.Date;

public class TrainingGroup {
    private int id;
    private Date startDate;
    private Date endDate;
    private Location location;

    public TrainingGroup(int id, Date startDate, Date endDate, Location location) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
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
}
