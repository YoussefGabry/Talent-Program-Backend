package com.talentProgram.courseRecommender.components;

import com.talentProgram.courseRecommender.models.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class BusinessCourseRecommender implements CourseRecommender {
    @Override
    public List<Course> recommendedCourses() {
        List<Course> businessCourses = new ArrayList<>();
        businessCourses.add(new Course("Economy",5));
        businessCourses.add(new Course("Math 1",3));
        businessCourses.add(new Course("Accounting",7));
        return businessCourses;
    }
}
