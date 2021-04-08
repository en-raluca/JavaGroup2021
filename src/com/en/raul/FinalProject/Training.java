package com.en.raul.FinalProject;

import java.util.List;
import java.util.Objects;

public class Training {
    int id;
    String code;
    String name;
    int nrOfParticipants;
    String level;
    List<Course> courseList;

    public Training(int id, String code, String name, int nrOfParticipants, String level, List<Course> courseList) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.nrOfParticipants = nrOfParticipants;
        this.level = level;
        this.courseList = courseList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Training)) return false;
        Training training = (Training) o;
        return getId() == training.getId() && getNrOfParticipants() == training.getNrOfParticipants() && Objects.equals(getCode(), training.getCode()) && Objects.equals(getName(), training.getName()) && Objects.equals(getLevel(), training.getLevel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCode(), getName(), getNrOfParticipants(), getLevel());
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", nrOfParticipants=" + nrOfParticipants +
                ", level='" + level + '\'' +
                '}';
    }
}
