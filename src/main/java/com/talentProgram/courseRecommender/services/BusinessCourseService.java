package com.talentProgram.courseRecommender.services;

import com.talentProgram.courseRecommender.components.CourseRecommender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class BusinessCourseService extends CourseService {

    @Autowired
    public void setBusinessCourseRecommender(@Qualifier("businessCourseRecommender") CourseRecommender courseRecommender) {
        this.setCourseRecommender(courseRecommender);
    }
}
