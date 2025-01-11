package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component("college")
public class College {

    @Autowired
    private Principal principal;

    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;

    @Value("${college.name}")
    private String collegeName;

    public College() {
        System.out.println("College constructor called");
    }

    public void test() {
        System.out.println("Testing call methods from College.");
        System.out.println("College name is " + collegeName);
        principal.principalInfo();
        teacher.teach();
    }
}