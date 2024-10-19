package com.seleniumexpress.autowired;

public class Human {

    private Heart heart;

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Human(Heart heart) {
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
