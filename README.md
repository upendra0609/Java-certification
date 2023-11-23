# Java-certification
OCJA


Array---------------
Every array in java is an object.

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

    int[] a,[]b;  //compiler time error(we can declare[] before 		    only first variable only)
    int[] a,b[]; a-1, b-2

    [] declaration before first variable is applicable for all     	variable(if any space, will be ignored by compiler)
     */


	int[] a = new int[-2];   //runTime error not compiler time error (compiler only check if you are providing int value or not)
