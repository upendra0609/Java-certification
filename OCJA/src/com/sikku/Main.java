package com.sikku;

public class Main {
    static {
        System.out.println("class loaded");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println("Test");
    }
}