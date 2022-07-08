package com.naga.revision.algorithms;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {9,8,7,6,4,5,3,2,1};

        /*
        * 1.select an element
        * 2.check it will all other elements
        * 3.if you find any greater element then swap it with current element
        * 4.repeat the same
        * */

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int biggestElementIndex = 0;

            for (int temp = 1 ; temp <= lastUnsortedIndex ; temp++)
                if(array[temp] > array[biggestElementIndex] )
                    biggestElementIndex = temp;


            swap(array,lastUnsortedIndex,biggestElementIndex);
        }

        for (int a : array) {
            System.out.println(a);
        }
    }
    static void swap(int[] array,int i,int j){

//        System.out.println("i"+i);
//        System.out.println("j"+j);
        int temp = array[j];
        array[j]=array[i];
        array[i] = temp;
    }
}
