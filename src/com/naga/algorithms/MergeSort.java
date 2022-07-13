package com.naga.algorithms;

public class MergeSort {


    public static void main(String[] args) {
        int[] array = {10,-5,20,15,-22,8,1};


        /*
        * In merge sort we will divide the array into multiple sub arrays
        * we will divide to the size of the element to 1
        * then we will merge the left and right sibling arrays in the order
        * then this array will be sorted
        *
        *
        *
        * */

        mergeSort(array,0, array.length);
        for (int i:array ) {

            System.out.println(i);

        }

    }//main


    public static void mergeSort(int[] array,int start,int end)
    {
        if(end - start < 2)
            return;

        int mid = (start+end)/2;
        mergeSort(array,start,mid);
        mergeSort(array,mid,end);
        merge(array,start,mid,end);

    }

    public static void merge(int[] array,int start,int mid,int end){
        if (array[mid-1] < array[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end-start];

        while(i < mid && j < end)
        {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array,i,array,start+tempIndex,mid-i);
        System.arraycopy(temp,0,array,start,tempIndex);

    }
}
