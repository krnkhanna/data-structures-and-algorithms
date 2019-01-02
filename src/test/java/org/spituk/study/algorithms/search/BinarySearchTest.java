package org.spituk.study.algorithms.search;

/**
 * The HelloWorld program implements an application that simply displays "Hello World!" to the standard output.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/9/2018
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(BinarySearch.search(array, 1));
        System.out.println(BinarySearch.search(array, 2));
        System.out.println(BinarySearch.search(array, 3));
        System.out.println(BinarySearch.search(array, 4));
        System.out.println(BinarySearch.search(array, 5));
        System.out.println(BinarySearch.search(array, 10));
    }

}
