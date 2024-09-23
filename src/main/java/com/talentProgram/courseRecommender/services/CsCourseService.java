package com.talentProgram.courseRecommender.services;

import com.talentProgram.courseRecommender.components.CourseRecommender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CsCourseService extends CourseService {
    @Autowired
    public CsCourseService(CourseRecommender courseRecommender) {
        super(courseRecommender);
    }
}
