package org.spituk.study.data.structures;

import org.spituk.study.data.structures.lists.ArrayList;

/**
 * The HelloWorld program implements an application that simply displays "Hello World!" to the standard output.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 11/28/2018
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.remove();
        System.out.println(list.size());
    }
}
