package com.sikku.array;

public class Main extends Thread {

    /*
    Two dimensional-->
        int [][] a;
        int a[][];
        int[][]a;
        int[] []a;
        int[] a[];
        int []a[];
     */

    /*
    Two dimensional-->
        int[][][] a;
        int [][][]a;
        int a[][][];
        int[][] []a;
        int[][] a[];
        int[] [][]a;
        int[] []a[];
        int[] a[][];
        int [][]a[];
        int []a[][];
     */


    /*
    int[] a,b;    a-1,b-1
    int[] a[],b;  a-2,b-1
    int[] []a,b;  a-2,b-2

    int[] a,[]b;  //compiler time error(we can declare[] before only first variable only)
    int[] a,b[]; a-1, b-2

    [] declaration before first variable is applicable for all variable(if any space, will be ignored by compiler)
     */

    /*
    Anonymous Array
    new int[] {1,2,3}; //valid
    new int[3] {1,2,3}; //Invalid
    new int[4] {1,2,3}; //Invalid
    new int[4]; //valid

    in case of anonymous array we can not declare array size if elements are initialized
     */
    public static void main(String[] args) {
//        int[] a = new int[-2];  //runtime error
//        int[] b = new int[1212];
//        System.out.println(a.length);
//        m(new int[78]);

        Object[] a = new String[3];
        a[0] = new Object();  //run time error
        a[1] = new String("sd");

    }

    public static void m(int[] ar) {
    }

}

