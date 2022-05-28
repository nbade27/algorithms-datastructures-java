package com.naga.algorithms;

public class InsertionSort {


    public static void main(String[] args) {
        int[] intArray = {9,8,7,6,5,4,3,2,1,56,55,54,43,32};
        // int[] intArray = {9,8,7,6,5};
        //iterating array from left to right
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int j;

            //if we found any element greater than newElement we will shift it to right position untill we found the less element
            //if we found less element then we will place the new element at that index
            for ( j = firstUnsortedIndex; j > 0 && intArray[j-1] > newElement; j--)
                    intArray[j] =intArray[j-1];
            intArray[j] = newElement;
        }//for

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
