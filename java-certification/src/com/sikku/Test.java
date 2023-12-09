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
            case "A" -> System.out.println("capital");
            case "b" -> System.out.println("b");
            case "B" -> System.out.println("B");
            case "a" -> System.out.println("small letter");
            default -> System.out.println("not match");
        }
    }
}
