package com.SpringIOC;

public class Vodafone implements Sim{

    public Vodafone(){
        System.out.println("Vodafone constructor called.");
    }

    @Override
    public void calling() {
        System.out.println("Calling using Vodafone SIM.");
    }

    @Override
    public void data() {
        System.out.println("Browsing internet using Vodafone SIM.");
    }
}