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






*Operator and Assignment :
	1. increment/decrement we can apply for any primitive type except boolean. Automatic typecasting will be done for increment/decrement operator.



+,-,*,/,%
max(int, type of a, type of b)
ex; int + float =float
    char + int = int
    float + double = double
etc.



	byte a = 20;
        byte b = 30;
        byte c = a+b;   //compile time error
        System.out.println(c);



	final byte a = 20;
        final byte b = 30;
        byte c = a+b;    //valid
        System.out.println(c);




	char ch1 = 'a';
        char ch2 = 's';
        char ch = ch1 + ch2;    //compile time error
        System.out.println(ch);



	char ch1 = 'a';
        char ch2 = 's';
        char ch = (int)ch1 + ch2;    //valid
        System.out.println(ch);



        System.out.println('a'+'b'+'c'); // 294


	System.out.println(10.0/0);   //(double/int) INFINITY
        System.out.println(10.0f/0);   //(float/int) INFINITY
        System.out.println(10/0);      //(int/int)   exception / by zero

in case of int type result we will get run time exception otherwise we will get INFINITY



System.out.println(Float.NaN== Float.NaN);   //(comparing NaN with any number will return always false)false
System.out.println(Float.NaN!= Float.NaN);    // true


-> ArithematicException is run time exception, and will raised only in  integral arithematic but not in floating point arithematic, the only operators which cause arithematic Exception are /and %.





Relational Operator(<,>,<=,>=):
1.  can apply for primitive.
2.  can not apply for non-primitive.
3.  nesting of relational operator is not allowed.(10<20<30<40) invalid


Equality Operator(==,!=);
1. Can apply for primitive as well as non primitive.


all are valid
	System.out.println(10 == 20);
        System.out.println('a' == 97.0);  //whenever lower and upper data type are compared lower will be auto casted to upper data type here 97.0==97.0
        System.out.println(10.5 == 12.0);
        System.out.println(false == false);



If arguments are different types, then equals() method returns false and it won't raise any error.

If there is no relation between argument types, then == operators will raise compile time error.





Clone() method:  

Shallow and Deep Cloning: present in Object class and by default meant for shallow cloning. If we want deep cloning for our objects, we required to override
	                  clone method in our class.


	

	Student s1 = new Student("aaa", 101);
        Student s2 = s1.clone();   //constructor will not execute in this line s1 initialized data will be there for for cloned object
        System.out.println(s1==s2); 



Bitwise operator:

bitwise operator & | ^ is applicable only for boolean and integral values but not for boolean values.
bitwise complement operator ~ is applicable only for integral values but not for boolean values.
bitwise operator ! is applicable only for boolean values but not for boolean values.



Short circuit operator=>

&& || 








Instanceof Operator:

-to check if the given object is of perticular type or not.

ArrayList l = new ArrayList();
Object o = l.get(0);
if(o instanceof Employee){
	sout("emp");
}else if(o instanceof Customer){
	sout("cust");
}




	Thread t = new Thread();
        System.out.println(t instanceof Thread);  //true
        System.out.println(t instanceof Object);  //true
        System.out.println(t instanceof Runnable);  //true
	System.out.println(t instanceof String);    //compile time error
	System.out.println(t instanceof Callable);    //false

To use instanceof operator compulsary there should be some relation between argument types, otherwise we will get compile time error. But this rule is not applicable if the argument is interface type.

for any class or interface X
null instanceof x is always false

System.out.println(null instanceof Callable);    //false


Assignment Operator:-

1. Simple Assignment:

int x = 10;

2. Chained operator:

a =b=c=d=10;

int a = b=c=10;  //compile time error  b,c are not declared


int a,b,c,d;
a = b=c=d =12; //valid

3. compound assignment

a += 20;


4. Conditional Operator(?:)




	 int x = 10;
         x = x++;
         x = x++;
         x = x++;
         x = x++;
         x = x++;
         x = x++;
         System.out.println(x);  //10
1.Consider x value for assignment (10)
2. Increment x value (x = 11)
3. perform asssignment with old considered value
   x = 10;



Operator Precedence:

highest precedence goes to unary operator then binary operator at last to ternary operator.
Assignment operator is having least precedence.


unary->
()
x++,x--,
++x,--x,~,!
new , type cast



binary->
*,/,%
+,-

>>,>>>,<<

<,<=,>,>=, instanceof
==, !=
&
^
|

&&
||


Ternary->
?:


Assignment->
=




Switch Statment:

byte,short,char,int  =>allowed (bcz of fixed range)
Byte, Short, Character, Integer =>allowed (bcz of autoboxing/autounboxing)
Enum => allowed (bcz of fixed number of constant)
String type also allowed

boolean,long,float,double  => not allowed  (bcz of not fixed range, in case of boolean only two option are availabe so better to use if-else)



=>curly brases are mandatory for switch and try-catch-finally
