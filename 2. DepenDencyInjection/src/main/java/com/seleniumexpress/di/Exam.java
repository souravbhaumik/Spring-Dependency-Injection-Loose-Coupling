package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {

/*-------------------------------------------MANUAL-------------------------------------------*/
        /*Student student = new Student();

//        student.studentName = "Tinni";
        student.setStudentName("Tinni");

        student.displayStudentInfo();*/

/*-------------------------------------------LET SPRING DO IT-------------------------------------------*/
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student tinni = context.getBean("tinniCon", Student.class);
        tinni.displayStudentInfo();

        Student shilu = context.getBean("shiluCon", Student.class);
        shilu.displayStudentInfo();
    }
}