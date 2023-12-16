package com.sikku.innerClass;

public class Main {

    private static class A {
        public void m1() {
            System.out.println("A");
        }
    }

    protected static class B {
        public void m1() {
            System.out.println("B");
        }
    }
//    public static void main(String[] args) {
//        A a = new A();
//        B b = new B();
//    }
}


class Client {
    public static void main(String[] args) {

    }

    public void m() {
        Main m = new Main();

    }

}
