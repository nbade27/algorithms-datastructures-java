package com.naga.algorithms;

public class RecursiveAlgorithm {

    public static void main(String[] args) {
        //System.out.println(iterativeFactorial(4));
        System.out.println(recursiveFactorial(4));
    }

    //let us understand this recursion by using factorial
    // first we will do in traditional

    public static int iterativeFactorial(int num){
        if(num == 0) return 1;
        int factorial = 1;

        for (int i = 1; i <= num; i++)
            factorial *= i;
        return factorial;
    }

    //let us use recursion for same factorial
    public static int recursiveFactorial(int num)
    {
        if(num == 0) return 1;
        return num * recursiveFactorial(num - 1);
    }
}
