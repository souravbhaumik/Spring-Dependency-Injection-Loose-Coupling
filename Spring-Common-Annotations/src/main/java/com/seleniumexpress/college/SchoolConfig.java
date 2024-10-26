package com.seleniumexpress.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchoolConfig {

    /* Commented out code to make college works. */
//    @Bean
//    public Principal principalBean() {
//        return new Principal();
//    }

//    @Bean
//    public Teacher mathTeacherBean() {
//        return new MathTeacher();
//    }

    @Bean(name = {"school", "schoolBean"})      // @Bean can have multiple names for one bean
    public School school() {      // class name is the bean ID if name is not being passed in @Bean
//        return new School(principalBean());       // Constructor Injection
        School school = new School();
//        school.setPrincipal(principalBean());
//        school.setTeacher(mathTeacherBean());
        return school;
    }

}
