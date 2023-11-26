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


/*
    Anonymous Array
    new int[] {1,2,3}; //valid
    new int[3] {1,2,3}; //Invalid
    new int[4] {1,2,3}; //Invalid
    new int[4]; //valid

    in case of anonymous array we can not declare array size if elements are initialized
*/



Number------>
child class
1. Byte
2. Short
3. Integer
4. Long
5. Float
6. Double


*****
 **  
Compiler always consider only reference type, but at runtime JVM will always consider 'runtime object' type.


	Object[] a = new String[3];
        a[0] = new Object();  	//run time error
        a[0] = new String("sd");



Local variable type inference(LVTI)=>
    -->(valid for local variable only)

var x = new String[89];   //valid
var x = new int[89];      //valid

var e = new Emp();          //valid
var x = new Employee[89];   //valid

var x = new var[34];   //Invalid

var x = "kl";   //valid


var i = 32;
i = "do";    //invalid reqired int provided String



# Types of variables in java=>
A) Based on type
1. Primitive
2. Reference

B)
1.Instance   (declared withiin class directly, outside the method and constructoer. (stored in heap memory))
2.Static     ()
3.Local 
	
