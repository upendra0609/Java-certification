package com.sikku;

public class DataType {
    public static void main(String[] args) {
        byte b = 10;
        short s = 343;
        int i = 2389;
        long l = 32827094L;

        float f = 239.23f;
        double d = 32878094.234;


        //octal
        // 0 to 9
        // prefix  0(zero)
        int x = 076;
        System.out.println(x);

        //hexadecimal
        // 0 to 9 and a-z(A-Z)
        // prefix  0x(zero) or 0X
        int y = 0X483A;
        System.out.println(y);


        //binary
        // 0 to 1
        // prefix  0b or 0B
        int bin = 0B0101;
        System.out.println(y);
    }
}
