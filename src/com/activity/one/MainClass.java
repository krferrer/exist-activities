package com.activity.one;

import com.activity.one.util.ClassC;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
            printVarA();
            printVarB();
            printVarC();

            ClassA a = new ClassA();

            if(a.x == true){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
    }

    public static void printVarA(){
        ClassA a = new ClassA();
        System.out.println("Class A variable : "+a.x);
    }

    public static void printVarB(){
        ClassB b = new ClassB();
        System.out.println("Class B variaasble : "+ Arrays.toString(b.days));
    }

    public static int printVarC(){
        ClassC c = new ClassC();
        int result = c.getInt(4);
        return result;
    }
}
