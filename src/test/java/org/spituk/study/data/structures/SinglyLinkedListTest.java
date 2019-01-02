package org.spituk.study.data.structures;

import org.spituk.study.data.structures.lists.SinglyLinkedList;

/**
 * The HelloWorld program implements an application that simply displays "Hello World!" to the standard output.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 11/27/2018
 */
public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
        singlyLinkedList.addNodeToEnd(3);
        singlyLinkedList.addNodeToEnd(4);
        singlyLinkedList.addNodeToEnd(5);

        System.out.println(singlyLinkedList.getElementFromEnd(2));

        singlyLinkedList.printListNodes();

        singlyLinkedList.addNodeToHead(2);
        singlyLinkedList.addNodeToHead(1);

        System.out.println(singlyLinkedList.getElementFromEnd(2));

        singlyLinkedList.printListNodes();
        singlyLinkedList.removeFromHead();
        singlyLinkedList.printListNodes();

        singlyLinkedList.removeFromEnd();
        singlyLinkedList.printListNodes();

        singlyLinkedList.removeNode(3);
        singlyLinkedList.printListNodes();
        singlyLinkedList.removeNode(2);
        singlyLinkedList.printListNodes();

        singlyLinkedList.removeNode(8);
        singlyLinkedList.printListNodes();

        singlyLinkedList.removeNode(4);
        singlyLinkedList.printListNodes();
    }
}
