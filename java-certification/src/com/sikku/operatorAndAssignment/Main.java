package com.sikku.operatorAndAssignment;

public class Main {
    public static void main(String[] args) {
//        byte b = 127;
//        b +=4;
//        System.out.println(b);

        final byte a = 20;
        final byte b = 30;
        byte c = a + b;
        System.out.println(c);

        float x = 1.2f;
        float y = 3.4f;
        float z = x + y;
        System.out.println(z);

        char ch1 = 'a';
        char ch2 = 's';
//        char ch = ch1 + ch2;
//        System.out.println(ch);

//        System.out.println(10.0 / 0);
//        System.out.println(10.0f / 0);
//        System.out.println(10 / 0);

        System.out.println(Float.NaN == Float.NaN);

        System.out.println(10 == 20);
        System.out.println('a' == 97.0);
        System.out.println(10.5 == 12.0);
        System.out.println(false == false);

        String s = "d";
        System.out.println(s.hashCode());  //100

        StringBuilder s1 = new StringBuilder("d");

        System.out.println(s.equals(s1.toString()));

    }
}
