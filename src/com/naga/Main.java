package com.naga;
/*
*
* We are starting our algorithms and data structures here
* This is Introduction to arrays in Data Structures
*
*
* */
public class Main {

    public static void main(String[] args) {
	int[] intArray = new int[7];
        intArray[0] = 5;
        intArray[1] = 66;
        intArray[2] = 11;
        intArray[3] = 89;
        intArray[4] = -55;
        intArray[5] = 43;
        intArray[6] = -9;
        int index = -1;
        for (int i = 0;i < intArray.length ;i++)
        {
            index ++;
            if(intArray[i] == 11)
                System.out.println("index "+index);
        }

    }
}
