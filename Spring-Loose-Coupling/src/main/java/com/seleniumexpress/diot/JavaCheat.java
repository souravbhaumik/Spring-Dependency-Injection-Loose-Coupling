package com.seleniumexpress.diot;

public class JavaCheat implements Cheating {

    public JavaCheat() {
        System.out.println("JavaCheat object created.");
    }

    @Override
    public void Cheat() {
        System.out.println("Calling from JavaCheat");
    }
}
