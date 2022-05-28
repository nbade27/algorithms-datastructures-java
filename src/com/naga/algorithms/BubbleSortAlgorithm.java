package com.naga.algorithms;

//testing specific file commit 2
//the moral of the story is that if we implement this bubble sort with
//inner for loop by array length it is taking 49 iterations
//if we take lastUnsortedIndex it is taking 28 iterations
//just check them with z value
//but answer is same
public class BubbleSortAlgorithm {


    public static void main(String[] args) {

        int z = 0;
        int[] intArray = {22,21,20,19,18,17,16,15};
        for (int lastUnsortedIndex = intArray.length - 1;lastUnsortedIndex > 0;lastUnsortedIndex --)
        {

            //we need to keep < here because we no need to iterate all elements because it will take i+1 element everytime for comparison
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[i+1])
                {
                    swap(intArray,i,i+1);

                }
                z++;

            }


        }

        System.out.println("Total steps taken : "+ z);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
    //this method wil swap the i'th and j'th element in the given array
    static void swap(int[] array,int i,int j){
        if(i != j)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
         }

    }

}
