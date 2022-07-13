package com.naga.codewars;

public class IncrementOperator {

    public static void main(String[] args) {
        int i = 0;
        System.out.println("++i");
        System.out.println(++i);

        System.out.println("i++");
        System.out.println(i++);

        for (int j = 0; j < 2; j++) {
            System.out.println("j++");
            System.out.println(j);
        }

        for (int k = 0; k < 2; ++k) {
            System.out.println("++k");
            System.out.println(k);
        }

    }
}
