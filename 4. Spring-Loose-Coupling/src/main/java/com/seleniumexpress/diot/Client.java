package com.seleniumexpress.diot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        /* Student student = new Student();
        MathCheat cheat = new MathCheat();
        student.setMathCheat(cheat);
        student.cheating(); */

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Beans xml file is loaded.\n");
        Student sourav = context.getBean("student", Student.class);
        sourav.Cheat();
    }

}
