package com.seleniumexpress.diot;

public class Student {

    private int id;

    private Cheating cheating;

    public void setId(int id) {
        this.id = id;
    }
    public void setCheating(Cheating cheating) {
        this.cheating = cheating;
    }

    public void Cheat() {
        System.out.println("Cheating method called from Student..");
        cheating.Cheat();
    }
}
