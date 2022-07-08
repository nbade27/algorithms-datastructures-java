package com.naga.revision.algorithms;

public class ShellSort {



    public static void main(String[] args) {
        int[] array = {9,8,7,4,5,6,1,2,3,10};

        //for (int gap = array.length/2; gap > 0; gap /= 2) {
        for (int gap = array.length/2; gap > 0; gap /= 2) {
            for (int i = gap ; i < array.length ; i++) {
                int newElement = array[i];
                int j = i;
                while ( j >= gap && array[j-gap ] > newElement)
                {
                    array[j] = array[j- gap];
                    j -= gap;
                }
                array[j] = newElement;
            }

            }
        for (int a : array) {
            System.out.println(a);
        }

        }//end


}
