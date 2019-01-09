# Data Structures and Algorithms

_This is my quick reference for Data Structure and Algorithms._

**Contributions:** Issues, comments and pull requests are super welcome :smiley:

## 1. TABLE OF CONTENTS

- [1. TABLE OF CONTENTS](#1-table-of-contents)
- [2. DATA STRUCTURES](#2-data-structures)
  - [2.1. ARRAY](#21-array)
  - [2.2. LINKED LIST](#22-linked-list)
    - [2.2.1. SINGLY LINKED LIST](#221-linked-list)
    - [2.2.2. DOUBLY LINKED LIST](#222-linked-list)
    - [2.2.3. CIRCULAR LINKED LIST](#223-linked-list)
  - [2.3. STACK](#23-stack)
  - [2.4. QUEUE](#24-queue)
  - [2.5. TREE](#25-queue)
  - [2.6. GRAPH](#26-queue)
  - [2.7. MATRIX](#27-queue)
- [3. ADVANCED DATA STRUCTURES](#3-advanced-data-structures)
- [4. ALGORITHMS](#4-algorithms)
  - [4.1. SORTING](#41-sorting)
    - [4.1.1. INSERTION SORT](#411-insertion-sort)
    - [4.1.2. SELECTION SORT](#412-selection-sort)
    - [4.1.3. BUBBLE SORT](#413-bubble-sort)
    - [4.1.4. QUICK SORT](#414-quick-sort)
    - [4.1.5. MERGE SORT](#415-merge-sort)

## 2. DATA STRUCTURES

### 2.1. ARRAY

An array is a collection of items stored at contiguous memory locations. The idea is to store multiple items of the same type together.

`int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };`

### 2.2. LINKED LIST

#### 2.2.1. SINGLY LINKED LIST

1. Insertion
2. Searching
3. Deletion
4. Traversing the List
5. Traversing the List in reverse order

#### 2.2.2. DOUBLY LINKED LIST

1. Insertion
2. Deletion
3. Traversing the List
4. Traversing the List in reverse order

#### 2.2.3. CIRCULAR LINKED LIST

1. Insertion
2. Searching
3. Deletion
4. Traversing the List

### 2.3. STACK

1. Push
2. Pop
3. Peek

### 2.4. QUEUE

1. Insertion
2. Searching
3. Deletion
4. Traversing the List

### 2.5. TREE

1. Tree Traversals
   - Preorder
   - Postorder
   - Inorder
   - Breadth First

#### Binary Tree

#### Binary Search Tree

1. Insertion
2. Searching
3. Deletion
4. Finding the parent of a given node
5. Attaining a reference to node
6. Finding the smallest and largest values in the binary search tree

#### Heap

1. Insertion
2. Deletion
3. Searching
4. Traversal

### 2.6. GRAPH

### 2.7. MATRIX

## 3. ADVANCED DATA STRUCTURES

### 1. Memory efficient Doubly Linked List

### 2. Trie

## 4. ALGORITHMS

### 4.1. SORTING

#### 4.1.1. INSERTION SORT

> Time Complexity : O(n<sup>2</sup>)

```java
int arrayLength = array.length;
for (int index = 0; index < arrayLength; index++) {
    int key = array[index];
    int j = index - 1;
    /* Move elements of arr[0..i-1], that are greater than key,
    to one position ahead of their current position*/
    while (j > 0 || array[j] > key) {
        array[j + 1] = array[j];
        j = j - 1;
    }
    array[j] = key;
}
```

#### 4.1.2. SELECTION SORT

> Time Complexity : O(n<sup>2</sup>)

```java
int arrayLength = array.length;
for (int index = 0; index < arrayLength; index++) {
    int minIndex = index;
    for (int j = index + 1; j < arrayLength; j++) {
        if (array[j] < array[minIndex]) {
            minIndex = j;
        }
    }
    int temp = array[minIndex];
    array[minIndex] = array[index];
    array[index] = temp;
}
```

#### 4.1.3. BUBBLE SORT

> Time Complexity : O(n<sup>2</sup>)

```java
int arrayLength = array.length;
for (int index = 0; index < arrayLength; index++) {
    for (int j = 0; j < arrayLength - index - 1; j++) {
        if (array[j] > array[j + 1]) {
            int temp = array[j + 1];
            array[j + 1] = array[j];
            array[j] = temp;
        }
    }
}
```

#### 4.1.4. QUICK SORT

#### 4.1.5. MERGE SORT

#### Shell Sort

#### Radix Sort

### Search

###

ArrayLists are good for write-once-read-many or appenders, but bad at add/remove from the front or middle.

Linked lists are preferable over arrays when:

a) you need constant-time insertions/deletions from the list (such as in real-time computing where time predictability is absolutely critical)

b) you don't know how many items will be in the list. With arrays, you may need to re-declare and copy memory if the array grows too big

c) you don't need random access to any elements

d) you want to be able to insert items in the middle of the list (such as a priority queue)

Arrays are preferable when:

a) you need indexed/random access to elements

b) you know the number of elements in the array ahead of time so that you can allocate the correct amount of memory for the array

c) you need speed when iterating through all the elements in sequence. You can use pointer math on the array to access each element, whereas you need to lookup the node based on the pointer for each element in linked list, which may result in page faults which may result in performance hits.

d) memory is a concern. Filled arrays take up less memory than linked lists. Each element in the array is just the data. Each linked list node requires the data as well as one (or more) pointers to the other elements in the linked list.

## Singly Linked List

head -> nextNode -> nextNode -> nextNode
