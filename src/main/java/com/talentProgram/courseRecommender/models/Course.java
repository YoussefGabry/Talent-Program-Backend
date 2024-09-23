package com.talentProgram.courseRecommender.models;

public class Course {
    private String name;
    private Integer creditHours;

    public Course(String name, Integer creditHours) {
        this.name = name;
        this.creditHours = creditHours;
    }

    public String getName() {
        return name;
    }

    public Integer getCreditHours() {
        return creditHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditHours(Integer creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "Course Name: " + name + " | Credit Hours: " + creditHours;
    }
}
