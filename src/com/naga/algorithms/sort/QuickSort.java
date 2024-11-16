package com.naga.algorithms.sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = { 10, -5, 20, 15, -22, 8, 1, -5 };

        quickSort(array, 0, array.length);
        for (int i : array)
            System.out.println(i);
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end - start < 2)
            return;

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);

    }

    public static int partition(int[] array, int start, int end) {
        int i = start;
        int j = end;
        int pivot = array[start];

        while (i < j) {
            while (i < j && array[--j] >= pivot)
                ;
            if (i < j) {
                array[i] = array[j];
            }

            while (i < j && array[++i] <= pivot)
                ;
            if (i < j) {
                array[j] = array[i];
            }
        }

        array[j] = pivot;

        return j;
    }

}
