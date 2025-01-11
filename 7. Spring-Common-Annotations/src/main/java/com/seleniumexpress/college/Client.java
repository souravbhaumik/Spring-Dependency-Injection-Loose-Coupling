package com.seleniumexpress.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
            AnnotationConfigApplicationContext collegeContext = new AnnotationConfigApplicationContext(CollegeConfig.class);
//            AnnotationConfigApplicationContext schoolContext = new AnnotationConfigApplicationContext(SchoolConfig.class);
//            AnnotationConfigApplicationContext schoolContext1 = new AnnotationConfigApplicationContext(SchoolConfig.class);
        try {
            College college = collegeContext.getBean("college", College.class);
            college.test();
//            School school = schoolContext.getBean("school", School.class);
//            school.test();
//            School school1 = schoolContext.getBean("schoolBean", School.class);
//            school1.test();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Closing the contexts");
            collegeContext.close();
//            schoolContext.close();
//            schoolContext1.close();
        }
    }
}