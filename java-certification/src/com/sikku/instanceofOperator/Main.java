package com.sikku.instanceofOperator;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t instanceof Thread);  //true
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Runnable);
//        System.out.println(t instanceof String);
        System.out.println(t instanceof Callable);    //false
    }
}
