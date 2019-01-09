package org.spituk.study.algorithms.sorting;

/**
 * The HelloWorld program implements an application that simply displays "Hello World!" to the
 * standard output.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 1/9/2019
 */
public class InsertionSort {

  public static void sort(int[] array) {
    int arrayLength = array.length;
    for (int index = 0; index < arrayLength; index++) {
      int key = array[index];
      int j = index - 1;
      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j = j - 1;
      }
      array[j + 1] = key;
    }
    return;
  }
}
