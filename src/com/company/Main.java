package com.company;

public class Main {

    public static void main(String[] args) {

        myname("Ganesh");
        addnums(4,5);
        anothermethod();
    }

    public static void myname(String mname){
        System.out.println(mname);
    }
    public static void addnums(int a,int b){
        System.out.println("sum:"+(a+b));
    }
    public static void anothermethod(){
        System.out.println("another method");
    }

}
