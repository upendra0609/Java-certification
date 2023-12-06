package com.sikku;

public class Test {
    public static void main(String[] args) {
        int x = 10;
        x = x++;
        x = x++;
        x = x++;
        x = x++;
        x = x++;
        x = x++;
        System.out.println(x);

        String s = "a";
        switch (s) {
            case "A":
                System.out.println("capital");
                break;
            case "b":
                System.out.println("b");
                break;
            case "B":
                System.out.println("B");
                break;
            case "a":
                System.out.println("small letter");
                break;
            default:
                System.out.println("not match");

        }
    }
}
