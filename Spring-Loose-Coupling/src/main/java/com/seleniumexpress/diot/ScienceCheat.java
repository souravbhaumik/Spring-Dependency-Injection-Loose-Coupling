package com.seleniumexpress.diot;

public class ScienceCheat implements Cheating {

    public ScienceCheat() {
        System.out.println("Science cheating started..");
    }

    @Override
    public void Cheat() {
        System.out.println("Calling from ScienceCheat");
    }
}
