package com.naga.revision.algorithms;

public class BubbleSortAlgorithm {
/*
*
* this algorithm is for revising the bubble_sort algorithm
*
* we need to check adjacent element and swap if any bigger element is found
*
* */

    public static void main(String[] args) {
        int[] array = {9,8,7,6,4,5,3,2,1};
        for (int lastUnsortedIndex = array.length - 1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {

            for(int i=0;i < lastUnsortedIndex ; i++)
            if(array[i ] > array[i+1] ){
                swap(array,i,i + 1);
            }
        }

        for (int a : array) {
            System.out.println(a);
        }
    }





    private static void swap(int[] arr,int sorceIndex,int targetIndex){
        int sourseElement = arr[sorceIndex];
        int tempElement = arr[targetIndex];
        arr[sorceIndex] = tempElement;
        arr[targetIndex] = sourseElement;

    }

}
