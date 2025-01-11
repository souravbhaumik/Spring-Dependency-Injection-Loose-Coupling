package com.seleniumexpress.diot;

public class MathCheat implements Cheating {

    public MathCheat() {
        System.out.println("MathCheat object created.");
    }

    @Override
    public void Cheat() {
        System.out.println("Calling from MathCheat");
    }
}
