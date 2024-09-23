package com.talentProgram.courseRecommender.components;

import com.talentProgram.courseRecommender.models.Course;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CourseRecommender {
    List<Course> recommendedCourses();
}
