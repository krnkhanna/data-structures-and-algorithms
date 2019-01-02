package org.spituk.study.programs;

/**
 * The HelloWorld program implements an application that simply displays "Hello World!" to the standard output.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/8/2018
 */
public class FactorialTest {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        try {
            System.out.println(factorial.getFactorialMultiThreaded(20));
            System.out.println(factorial.getFactorialWithLoop(20));
            System.out.println(factorial.getFactorialWithRecursion(20));
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

}
