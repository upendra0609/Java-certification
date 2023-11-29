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

//        var b = null;  //invalid

        var var = 2;   //valid
        System.out.println(var);

//        int _ = 12;    //invalid
        int _1 = 12;
        int $3 = 23;
        System.out.println($3);
        System.out.println(_1);
    }
}
