package com.myproject.service;

import java.util.List;

/**
 * Created by atpop on 07 Apr 2021
 */

public class Training {

    private int id;
    private String code;
    private String name;
    private int nrOfParticipants;
    private String level;
    private String trainingType;
    private List<Course> courseList;

    public Training(int id, String code, String name, int nrOfParticipants,
                    String level, String trainingType, List<Course> courseList) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.nrOfParticipants = nrOfParticipants;
        this.level = level;
        this.trainingType = trainingType;
        this.courseList = courseList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrOfParticipants() {
        return nrOfParticipants;
    }

    public void setNrOfParticipants(int nrOfParticipants) {
        this.nrOfParticipants = nrOfParticipants;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public int hashCode() {
        return 31 * id;
    }

    @Override
    public boolean equals(Object obj) {
        Training training = (Training) obj;
        if (this.id == training.getId()) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", nrOfParticipants=" + nrOfParticipants +
                ", level='" + level + '\'' +
                ", trainingType='" + trainingType + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
