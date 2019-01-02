package org.spituk.study.data.structures.lists;

/**
 * This is a sample implementation of a Singly Linked List.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 11/27/2018
 */
public class SinglyLinkedList<T> {

    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void addNodeToHead(final T data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void addNodeToEnd(final T data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node tempNode = this.head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    public void removeFromHead() {
        if (this.head == null) {
            throw new IllegalStateException("Removing from empty list");
        }
        this.head = this.head.next;
    }

    public void removeFromEnd() {
        if (this.head == null) {
            throw new IllegalStateException("Removing from empty list");
        }
        if (this.head.next == null) {
            this.head = null;
            return;
        }
        Node currentNode = this.head.next;
        Node previousNode = this.head;
        while (currentNode.next != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = null;
    }

    public void removeNode(T data) {
        if (this.head == null) {
            throw new IllegalStateException("Removing from empty list");
        }
        if (this.head.data == data) {
            this.head = this.head.next;
            return;
        }
        Node currentNode = this.head.next;
        Node previousNode = this.head;
        while (currentNode.data != data) {
            previousNode = currentNode;
            if (currentNode.next == null) {
                throw new IllegalArgumentException("Element was not there in the list");
            }
            currentNode = currentNode.next;
        }
        previousNode.next = currentNode.next;
    }

    public void printAlternateListNodes() {
        if (this.head == null) {
            return;
        }
        Node tempNode = this.head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    public void printListNodes() {
        if (this.head == null) {
            return;
        }
        Node tempNode = this.head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    public SinglyLinkedList reverseList() {
        if (this.head == null || this.head.next == null) {
            return this;
        }
        //th
        //while (this.h)
        return this;
    }

    public T getElementFromEnd(final int index) {
        if (head == null) {
            throw new IllegalArgumentException();
        }
        Node<T> temp = this.head;
        int currentIndex = 0;
        while (currentIndex < index) {
            if (temp == null) {
                throw new IllegalArgumentException();
            }
            temp = temp.next;
            currentIndex++;
        }
        Node<T> nodeAtIndex = this.head.next;
        while (temp.next != null) {
            nodeAtIndex = nodeAtIndex.next;
            temp = temp.next;
        }
        return nodeAtIndex.data;
    }

    private class Node<T> {

        private T data;
        private Node next;

        Node(final T data) {
            this.data = data;
            this.next = null;
        }
    }
}
