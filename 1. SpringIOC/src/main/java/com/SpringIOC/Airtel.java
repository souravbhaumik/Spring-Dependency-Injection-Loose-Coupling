package com.SpringIOC;

public class Airtel implements Sim{

    public Airtel() {
        System.out.println("Airtel Constructor called.");
    }

    @Override
    public void calling() {
        System.out.println("Calling using Airtel SIM.");
    }

    @Override
    public void data() {
        System.out.println("Browsing internet using Airtel SIM.");
    }
}
