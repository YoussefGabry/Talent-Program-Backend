package com.talentProgram.courseRecommender.configurations;

import com.talentProgram.courseRecommender.components.CourseRecommender;
import com.talentProgram.courseRecommender.components.CsCourseRecommender;
import com.talentProgram.courseRecommender.components.BusinessCourseRecommender;
import com.talentProgram.courseRecommender.components.MassCommCourseRecommender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.talentProgram")
public class CourseRecommenderApplicationConfiguration {

    @Bean
    @Primary
    public CourseRecommender csCourseRecommender() {
        return new CsCourseRecommender();
    }

    @Bean(name = "businessCourseRecommender")
    public CourseRecommender businessCourseRecommender() {
        return new BusinessCourseRecommender();
    }

//    @Bean
//    public CourseRecommender massCommCourseRecommender() {
//        return new MassCommCourseRecommender();
//    }
}
