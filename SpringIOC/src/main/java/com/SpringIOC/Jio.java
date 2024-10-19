package com.SpringIOC;

public class Jio implements Sim{

    public Jio() {
        System.out.println("Airtel Constructor called.");
    }

    @Override
    public void calling() {
        System.out.println("Calling using Jio SIM.");
    }

    @Override
    public void data() {
        System.out.println("Browsing internet using Jio SIM.");
    }
}
