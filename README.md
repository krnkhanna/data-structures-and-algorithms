# Data Structures and Algorithms

## Data Structures

### Array

### Linked List

#### Singly Linked List

1. Insertion
2. Searching
3. Deletion
4. Traversing the List
5. Traversing the List in reverse order

#### Doubly Linked List

1. Insertion
2. Deletion
3. Traversing the List
4. Traversing the List in reverse order

#### Circular Linked List

### Stack

### Queue



### Tree

1. Tree Traversals
    * Preorder
    * Postorder
    * Inorder
    * Breadth First

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

### Graph

### Matrix

### Advanced Data Structures

#### Memory efficient Doubly Linked List

#### Trie




## Algorithms

### Sorting

#### Bubble Sort

#### Insertion Sort

#### Selection Sort

#### Merge Sort

#### Quick Sort

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
