package com.driver;

public class Main {

    static class A{
        public static String meth(){
            return "invoking method from class A";
        }
    }

    static class B extends A{
        public static String meth() {
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {

        B objb=new B();
        A obj2=new B();
        System.out.println(obj2.meth());
        System.out.println(objb.meth());
    }
}

