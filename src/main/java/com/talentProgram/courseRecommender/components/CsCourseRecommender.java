package com.talentProgram.courseRecommender.components;

import com.talentProgram.courseRecommender.models.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class CsCourseRecommender implements CourseRecommender {

    @Override
    public List<Course> recommendedCourses() {
        List<Course> csCourses = new ArrayList<>();
        csCourses.add(new Course("Database",4));
        csCourses.add(new Course("Data Structure",8));
        csCourses.add(new Course("Algorithms",12));
        return csCourses;
    }
}
