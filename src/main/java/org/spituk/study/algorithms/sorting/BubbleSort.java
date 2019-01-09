package org.spituk.study.algorithms.sorting;

/**
 * The HelloWorld program implements an application that simply displays "Hello World!" to the
 * standard output.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/9/2018
 */
public class BubbleSort {

    public static void sort(int[] array) {
        int arrayLength = array.length;
        for (int index = 0; index < arrayLength; index++) {
            for (int j = 0; j < arrayLength - index - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}