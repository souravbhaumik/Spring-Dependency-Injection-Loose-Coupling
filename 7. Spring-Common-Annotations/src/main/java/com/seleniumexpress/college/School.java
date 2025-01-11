package com.seleniumexpress.college;

public class School {

    private Principal principal;
    private Teacher teacher;

//    public School(Principal principal) {
//        this.principal = principal;
//    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void test() {
        System.out.println("Testing call methods from School.");
        principal.principalInfo();
        teacher.teach();
    }

}
