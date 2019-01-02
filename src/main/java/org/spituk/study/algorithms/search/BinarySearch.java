package org.spituk.study.algorithms.search;

/**
 * The HelloWorld program implements an application that simply displays "Hello World!" to the standard output.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/9/2018
 */
public class BinarySearch {

    public static int search(int[] array, int item) {
        return search(array, item, 0, array.length - 1);
    }


    private static int search(int[] array, int item, int startIndex, int endIndex) {
        while (endIndex >= startIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (array[mid] == item) {
                return mid;
            } else {
                if (array[mid] > item) {
                    endIndex = mid - 1;
                } else {
                    startIndex = mid + 1;
                }
            }
        }
        return -1;
    }
}
