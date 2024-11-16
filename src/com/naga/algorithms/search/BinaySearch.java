package com.naga.algorithms.search;

import java.util.Arrays;

public class BinaySearch {
    public static void main(String[] args) {
        int[] array = { 10, -5, 20, 15, -22, 8, 1 };

        Arrays.sort(array);
        System.out.println(array);
        System.out.println(recursiveBinarySearch(array, 1));
        // System.out.println(binarySearchIterative(array, 1));

    }// main

    private static int binarySearchIterative(int[] array, int element) {

        int start = 0;
        int end = array.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (element > array[mid]) {
                start = mid + 1;
            } else
                end = mid;
        }
        return -1;
    }

    private static int recursiveBinarySearch(int[] array, int element) {
        return recursiveBinarySearch(array, element, 0, array.length);
    }

    private static int recursiveBinarySearch(int[] array, int element, int start, int end) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (element == array[mid])
            return mid;
        if (element > array[mid])
            return recursiveBinarySearch(array, element, mid + 1, end);
        else
            return recursiveBinarySearch(array, element, start, mid);
    }
}
