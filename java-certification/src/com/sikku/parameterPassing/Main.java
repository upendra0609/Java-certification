package com.sikku.parameterPassing;

public class Main {
    public static void main(String[] args) {
        Integer i =10;
        m1(i);
        System.out.println(i);

    }

    public static void m1(Integer i){
        i = i*10;
    }
}
