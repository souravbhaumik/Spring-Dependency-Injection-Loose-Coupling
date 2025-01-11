package com.seleniumexpress.beanlifecycle.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class test {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        studentDao.selectAllRows();
    }

}
