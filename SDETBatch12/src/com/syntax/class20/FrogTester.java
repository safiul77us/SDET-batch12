package com.syntax.class20;

public class FrogTester {
    public static void main(String[] args) {

        Frog f = new Frog("valera", "pink", 16, 28);
        f.printInfo();

        new Frog("froggy", "green", 2).printInfo();
    }
}
