package com.sikku.dataType;

public class Main {
    public static void main(String[] args) {
        char ch1 = '\u0061';
        /* Invalid
        char ch2 = '\i0061';
        char ch3 = \u0061;
         */
        System.out.println(ch1);

        long l = Long.MAX_VALUE;
//        System.out.println(l);
        System.out.println(Long.MAX_VALUE - Float.MAX_VALUE);
//        float f = l;
//        System.out.println(f==l);
        /*
        Invalid
        char ch2 = 'A';
        byte b1 = ch2;
        System.out.println(b1);
         */
        final char ch2 = 'A';
        byte b1 = ch2;
        System.out.println(b1);

    }
}
