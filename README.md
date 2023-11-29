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





Type Inference-->
	Based on provided value, automatic detection/ /identification of the type by compiler is called type inference.

Local Variable Type Inference-->
until java 9 for local variable we have to declare the type explicitly. but from java 10 version onwards, we are not required to declare 
the type explicitly. Based on your provided value the type will considered automatically this is nothing but Local variable type inference.



public static void main(String[] args) {
        var s = "String";
        s = "new String";
        System.out.println(s);
        var i = 12;
        System.out.println(i);
}


Advantage=>
	we are not required to specify the type multiple times. It is more convient to the programmer.



=>Where we can use LVTI-:
  1.  we can use for local variable inside a method.
  2.  we can use for local variable inside static/instance block;
  3. inside loop for index variable.
  4. inside for each loop.
  5. to store return value of a method.


int[] ar = {1, 2, 3, 4};
        for (var x: ar){
            System.out.println(x);
}

//valid





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
    }
}






public class Main {
    
    public static void main(String[] args) {
       var s = m1();
    }

     public static String m1() {
       return "abcd";
    }
}



=>Where we can not use LVTI-:

1. as a instance/static variable
2. we can not use LVTI for uninitialized local variables.
3. For null value we can't use null.
4. For method parameter var is not allowed. bcz at run time which type value will come compiler can't guess the type of value.
5. For method return type we can't use var. bcz we don't know which value we are going to return.



public class Main {
    
    public static void main(String[] args) {
       var s;   //compile time error bcz uf uninitilaization
       var i = null;  //invalid
    }
	public void m1(var x){  //invalid

	}
}

Note: var replaces at compile time with provided value that means var concept is applicable only in compile time not in run time

	var var = 2;   //valid  bcz var is not a keyword in java after compilation var will replaced with int(int var = 2;)
        System.out.println(var);   //valid



var x = {1,2,3}; //invalid


        int _ = 12;    //invalid  As of Java 9, '_' is a keyword, and may not be used as an identifier
        int _1 = 12;   //valid
        System.out.println(_1);

	int _1 = 12;  //valid
        int $3 = 23;  //valid
        System.out.println($3);
        System.out.println(_1);

