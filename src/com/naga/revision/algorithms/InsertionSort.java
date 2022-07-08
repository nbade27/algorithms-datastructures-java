package com.naga.revision.algorithms;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {9,8,7,4,5,6,1,2,3,10};
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length ; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];

            int j;
            for ( j = firstUnsortedIndex; j > 0 && array[j-1] > newElement ; j--)
                array[j] = array[j-1];
            array[j] = newElement;
        }

        for (int a : array) {
            System.out.println(a);
        }
    }

}

//        int[] intArray = {9,8,7,6,5,4,3,2,1,56,55,54,43,32};
//        // int[] intArray = {9,8,7,6,5};
//        //iterating array from left to right
//        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
//        int newElement = intArray[firstUnsortedIndex];
//        int j;
//
//        //if we found any element greater than newElement we will shift it to right position untill we found the less element
//        //if we found less element then we will place the new element at that index
//        for ( j = firstUnsortedIndex; j > 0 && intArray[j-1] > newElement; j--)
//        intArray[j] =intArray[j-1];
//        intArray[j] = newElement;
//        }//for
//
//        for (int i = 0; i < intArray.length; i++) {
//        System.out.println(intArray[i]);
//        }
//