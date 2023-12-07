package com.sikku.doWhhile;

public class Main {
    public static void main(String[] args) {
//        final int a = 10, b = 20;
//        do {
//            System.out.println("Hello");
//        } while (a < b);
//        System.out.println("Hii");

        l1:
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            l2:
            for (int j = i; j < 10; j++) {
                System.out.println(j);
//                break l1;
                continue l1;
            }
        }
    }
}
