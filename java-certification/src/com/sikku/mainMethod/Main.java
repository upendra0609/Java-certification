package com.sikku.mainMethod;

public class Main {
    public static void m1() {
        System.out.println("Parent m1()");
    }
}

class Child extends Main {

    public static void m1() {
        System.out.println("Child m1()");
    }

    public static void main(String[] args) {
        Main m = new Child();
        m.m1();
    }

}
