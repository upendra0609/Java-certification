package com.sikku.protectedModifier;

public class Test implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        Test t = new Test();
        Test t1 = (Test) t.clone();
        Dog d = new Dog();
//        d.clone(); //compile time error
        System.out.println(t==t1);
    }
}

class Dog implements Cloneable {
    public Dog m1() throws CloneNotSupportedException {
        Dog d = new Dog();
        return (Dog) d.clone();
    }
}
