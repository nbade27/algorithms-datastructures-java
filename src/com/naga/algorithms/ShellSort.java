package com.naga.algorithms;

public class ShellSort {


    public static void main(String[] args) {
        int[] intArray = {9,8,7,6,5,4,3,2,1,56,55,54,43,32};

        /*
        1.we need to generate gap value by half of the array length
        2.compare the element with same gap value index if greater
           then shift the element and store the value
        3.continue the same process until you reach 0th index
        4.then repeat the same process with next to gap valued element
            untill you reach the end of array
        5.then again half the gap value and contineu the same process untill you get 1
         then array will be sorted
         */


        for (int gap = intArray.length/2; gap >= 1; gap /= 2) {

            for (int i = gap; i < intArray.length ; i++) {
                int newElement = intArray[i];

                int j = i;
                while (j >= gap && intArray[j - gap] > intArray[i])
                {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                // we should not use below line because after first itreration ith index value will be changed
               // intArray[j] = intArray[i];
                intArray[j] = newElement;


            }

        }


        for (int i = 0; i < intArray.length; i++) {
            //testing commit 4
            System.out.println(intArray[i]);
        }
    }
}
