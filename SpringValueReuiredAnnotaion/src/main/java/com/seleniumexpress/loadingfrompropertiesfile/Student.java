package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("${student.name}")
    private String name;

    @Value("${student.interestedCourse}")
    private String interestedCourse;

    @Value("${student.hobby}")
    private String hobby;

//    @Value("${student.name}")
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Value("${student.interestedCourse}")
//    public void setInterestedCourse(String interestedCourse) {
//        this.interestedCourse = interestedCourse;
//    }
//
//    @Value("${student.hobby}")
//    public void setHobby(String hobby) {
//        this.hobby = hobby;
//    }

    public void displayStudentInfo() {
        System.out.println(
                "Student name = " + name + ", interested course = " + interestedCourse + ", hobby = " + hobby
        );
    }
}
