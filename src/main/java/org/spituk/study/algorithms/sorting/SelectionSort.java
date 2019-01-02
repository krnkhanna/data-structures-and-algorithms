package org.spituk.study.algorithms.sorting;

/**
 * Class for Selection Sort.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/9/2018
 */
public class SelectionSort {

    /**
     * @param array array to be sorted.
     */
    public static void sort(int[] array) {

        int arrayLength = array.length;
        for (int index = 0;
             index < arrayLength;
             index++) {
            int minIndex = index;
            for (int j = index + 1;
                 j < arrayLength;
                 j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[index];
            array[index] = temp;
        }
        return;
    }
}
