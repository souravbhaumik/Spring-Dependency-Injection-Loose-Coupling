package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;

/*    public Human(){
        System.out.println("Default Constructor");
    }

    @Autowired      // @Autowired annotation seq -> 1. byType, 2. byName
    @Qualifier("humanHeart")
    public void setHeart(Heart heart) {
        this.heart = heart;
    }*/

    public Human(Heart heart) {
        System.out.println("Parameterized Constructor");
        this.heart = heart;
    }

    public void startPumping() {
        if (heart == null) {
            System.out.println("Your heart is not pumping, pump it manually to get alive please.");
            return;
        }
        heart.pump();
    }
}
