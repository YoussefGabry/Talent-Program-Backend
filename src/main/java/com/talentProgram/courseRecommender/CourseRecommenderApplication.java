package com.talentProgram.courseRecommender;

import com.talentProgram.courseRecommender.configurations.CourseRecommenderApplicationConfiguration;
import com.talentProgram.courseRecommender.models.Course;
import com.talentProgram.courseRecommender.services.BusinessCourseService;
import com.talentProgram.courseRecommender.services.CsCourseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CourseRecommenderApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(CourseRecommenderApplicationConfiguration.class);

		CsCourseService csCourseService = context.getBean(CsCourseService.class);

		for (Course c : csCourseService.getRecommendedCourses()){
			System.out.println(c.toString());
		}

		BusinessCourseService businessCourseService = context.getBean(BusinessCourseService.class);

		for (Course c : businessCourseService.getRecommendedCourses()){
			System.out.println(c.toString());
		}


//		MassCommCourseService massCommCourseService = context.getBean(MassCommCourseService.class);
//
//		for (Course c : massCommCourseService.getRecommendedCourses()){
//			System.out.println(c.toString());
//		}

	}

}
