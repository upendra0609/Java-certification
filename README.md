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
2.Static     (    )
3.Local      (    )
	

For instance and static variables JVM will provide default value but for local variable JVM won't provide default value, compulsary we should perform initialization implicitly before using that variable. If we are not using local variable, then we are not required to perform initialization explicitly.




    public static void main(String[] args) {
        int x;
        if (args.length > 0) {
            x = 10;
        }
        System.out.println(x);
    }

compile time error. (command line argument is run time phenominon)







	int i;
        int j = 10;
        if (j < 5) {
            j++;
        } else {
            j++;
            i = j--;
        }

	System.out.println(i + "  " + j);  //compile time error


if j is final then compiler will consider value of j and according to this value, condition will be checked.


	int i;
        final int j = 10;
        if (j < 5) {
	    System.out.println(j);
        } else {
            i = j--;
        }

	System.out.println(i + "  " + j);  //valid





















public class Main {
	public static void main(String[] args) {
        	System.out.println("Parent");
    	}
    
}

class Child extends Main{

}

-javac Main
-java Child

inheritance is applicable for main method, parent class main method will be executed if child class is not having main method.




public class Main {
	public static void main(String[] args) {
        	System.out.println("Parent");
    	}
    
}

class Child extends Main{
	public static void main(String[] args) {
        	System.out.println("Parent");
    	}
}


this is not method overridding this is method over hiding.
method overloading is aplicable for main method but method overridding is not applicable for main method.




public Main{
	static{
		System.out.print("static block");
	}
}

run time exception, even static block will not be executed until there is no main method
