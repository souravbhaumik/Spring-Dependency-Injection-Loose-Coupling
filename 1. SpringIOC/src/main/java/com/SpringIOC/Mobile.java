package com.SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config loaded!");
//        Airtel airtel = context.getBean("airtel", Airtel.class);
//        airtel.data();
        Sim sim = context.getBean("sim", Sim.class);
        sim.data();
    }
}
