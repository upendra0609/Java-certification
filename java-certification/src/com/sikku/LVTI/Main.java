package com.sikku.LVTI;

public class Main {
    int i;

    {
        var i = 10;
    }

    static {
        var x = 12;
        System.out.println(x);
    }

    public static void main(String[] args) {
        var s = "String";
        s = "new String";
        System.out.println(s);
        var i = 12;
        System.out.println(i);


        int[] ar = {1, 2, 3, 4};
        for (var x: ar){
            System.out.println(x);
        }
    }
}
