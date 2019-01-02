package org.spituk.study.data.structures.lists;

/**
 * The HelloWorld program implements an application that simply displays "Hello World!" to the standard output.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 11/28/2018
 */
public class ArrayList<T> {

    /**
     * access(read/write) an element at an index: O(1) constant time. insert/remove an element at an index: O(n) linear
     * time. insert/remove at end: O(1) constant time:
     * <p>
     * Elements are stored as contiguous memory block. *  Access elements at any index in constant time.
     */

    private int endIndex = -1;

    private int arrayCapacity;

    private Object[] array;

    private static final int INITIAL_CAPACITY = 16;

    public ArrayList() {
        this.array = new Object[INITIAL_CAPACITY];
        this.arrayCapacity = INITIAL_CAPACITY;
    }

    public ArrayList(final int initialCapacity) {
        this.array = new Object[initialCapacity];
        this.arrayCapacity = initialCapacity;
    }

    public void add(T data) {
        ensureCapacity();
        this.array[++this.endIndex] = data;
    }

    public T remove() {
        T data = (T) this.array[this.endIndex];
        endIndex--;
        return data;
    }

    public int size() {
        return this.endIndex + 1;
    }

    public T get(final int index) {
        if (endIndex < index) {
            throw new IllegalArgumentException();
        }
        return (T) this.array[index];
    }


    private void ensureCapacity() {
        if (this.endIndex == this.arrayCapacity - 1) {
            int newSize = this.arrayCapacity * 2;
            Object[] newArray = new Object[newSize];
            for (int index = 0;
                 index <= this.endIndex;
                 index++) {
                newArray[index] = this.array[index];
            }
            this.array = newArray;
            this.arrayCapacity = newSize;
        }
    }

}
