package com.naga.algorithms.sort;
/**
 *  As the name suggests we will select element from left to right and compares with each other element
 *  and if we find any bigger element we will take that element.
 *  and selects the bigger element and if we reach the end position then we will replace at last index
 *
 */

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = {9,8,7,6,5,4,3,2,1,56,55,54,43,32};
       // int[] intArray = {9,8,7,6,5};
        //here last unsorted index is the last element if the array
        for (int lastUnsortedIndex = intArray.length - 1;lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int maxValueIndex =0;
            //we will initialize with first unsorted index

            //
            //we need to keep <= because we need to iterate every element upto lastUnsortedIndex(Unlike bubble sort)
            for (int j = 1; j <= lastUnsortedIndex; j++) {
                if(intArray[j] > intArray[maxValueIndex] )
                    maxValueIndex = j;
            }
            swap(intArray,maxValueIndex,lastUnsortedIndex);
        }




     //   System.out.println("Total steps taken : "+ z);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
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
