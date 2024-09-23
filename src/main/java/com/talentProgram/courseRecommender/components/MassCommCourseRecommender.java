package com.talentProgram.courseRecommender.components;

import com.talentProgram.courseRecommender.models.Course;

import java.util.ArrayList;
import java.util.List;

public class MassCommCourseRecommender implements CourseRecommender{
    @Override
    public List<Course> recommendedCourses() {
        List<Course> massCommCourses = new ArrayList<>();
        massCommCourses.add(new Course("Marketing",4));
        massCommCourses.add(new Course("Social Media",8));
        return massCommCourses;
    }
}
