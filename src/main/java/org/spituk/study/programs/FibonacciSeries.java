package org.spituk.study.programs;

import static java.lang.String.format;

/**
 * The HelloWorld program implements an application that simply displays "Hello World!" to the standard output.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/8/2018
 */
public class FibonacciSeries {

    private final static String NUMBER_PRINT_FORMAT = " %d ";


    public static void printFibonacciSeriesByIteration(final int elements) {
        int a = 1;
        int b = 1;
        System.out.print(format(NUMBER_PRINT_FORMAT, a));
        System.out.print(format(NUMBER_PRINT_FORMAT, b));
        for (int index = 0;
             index < elements - 1;
             index++) {
            int c = a + b;
            System.out.print(format(NUMBER_PRINT_FORMAT, c));
            a = b;
            b = c;
        }
    }


    public static void main(String[] args) {
        printFibonacciSeriesByIteration(10);
    }

}
