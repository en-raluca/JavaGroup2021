package com.en.raul.FinalProject;

import java.util.Objects;

public class Course {
    int id;
    String title;
    String description;
    int hoursDuration;

    public Course(int id, String title, String description, int hoursDuration) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.hoursDuration = hoursDuration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getId() == course.getId() && getHoursDuration() == course.getHoursDuration() && Objects.equals(getTitle(), course.getTitle()) && Objects.equals(getDescription(), course.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getDescription(), getHoursDuration());
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", hoursDuration=" + hoursDuration +
                '}';
    }
}
