package com.naga.revision.algorithms;

public class Recursion {

    public static void main(String[] args) {

        //we must have breaking condition in recursion programming
        //we will use factorial for example

        long fact = factorial(99);
        //getting 0 for 99 may be type issue
        System.out.println(fact);
    }

    public static long factorial(long num){
        if(num == 0) return 1;
       // System.out.println(num);

         return num * factorial(num - 1);

    }
}
