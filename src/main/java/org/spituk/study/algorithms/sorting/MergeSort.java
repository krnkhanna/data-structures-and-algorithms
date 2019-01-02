package org.spituk.study.algorithms.sorting;

/**
 * The HelloWorld program implements an application that simply displays "Hello World!" to the standard output.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/9/2018
 */
public class MergeSort {

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0;
             i < n1;
             ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0;
             j < n2;
             ++j) {
            R[j] = arr[m + 1 + j];
        }


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    void sort(int array[], int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            // Find the middle point
            int mid = (startIndex + endIndex) / 2;

            // Sort first and second halves
            sort(array, startIndex, mid);
            sort(array, mid + 1, endIndex);

            // Merge the sorted halves
            merge(array, startIndex, mid, endIndex);
        }
    }


}
