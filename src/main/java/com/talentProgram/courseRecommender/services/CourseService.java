package com.talentProgram.courseRecommender.services;

import com.talentProgram.courseRecommender.components.CourseRecommender;
import com.talentProgram.courseRecommender.models.Course;

import java.util.List;


public abstract class CourseService {
    private CourseRecommender courseRecommender;

    public CourseService() {
    }

    public CourseService(CourseRecommender courseRecommender) {
        this.courseRecommender = courseRecommender;
    }

    public void setCourseRecommender(CourseRecommender courseRecommender) {
        this.courseRecommender = courseRecommender;
    }

    public List<Course> getRecommendedCourses(){
        return courseRecommender.recommendedCourses();
    }
}
