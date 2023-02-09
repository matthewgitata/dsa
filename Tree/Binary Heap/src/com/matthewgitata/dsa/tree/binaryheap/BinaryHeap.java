package com.matthewgitata.dsa.tree.binaryheap;

/**
 * The {@code BinaryHeap} class defines the properties of a BinaryHeap
 * and its operations including creation, peeking, extractMin, extractMax,
 * traversal, size, insertion, and deletion.
 * <p>
 * created by @matthewgitata on 09/02/2023.
 */
public class BinaryHeap {
    int[] arr;
    int sizeOfTree;

    /**
     * Creates BinaryHeap.
     *
     * @param size the size of the Binary Heap.
     */
    public BinaryHeap(int size) {
        arr = new int[size + 1];
        this.sizeOfTree = 0;
        System.out.println("Binary Heap has been created.");
    }

    /**
     * Check if BinaryHeap is empty.
     *
     * @return true if BinaryHeap is empty, otherwise false.
     */
    public boolean isEmpty() {
        if (sizeOfTree == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Peek of heap.
     *
     * @return the root of the Binary Heap
     */
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Binary Heap is Empty!");
            return null;
        }
        return arr[1];
    }

    /**
     * Get size of the Binary Heap.
     *
     * @return the number of filled cells.
     */
    public int sizeOfBinaryHeap() {
        return sizeOfTree;
    }

    /**
     * Level Order Traversal
     */
    public void levelOrder() {
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    /**
     * Heapify for Insert.
     *
     * @param index    index of node
     * @param heapType type  of heap
     */
    public void heapifyBottomToTop(int index, String heapType) {
        int parent = index / 2;
        if (index <= 1) {
            return;
        }
        if (heapType == "Min") {
            if (arr[index] < arr[parent]) {
                int tmp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = tmp;
            }
        } else if (heapType == "Max") {
            if (arr[index] > arr[parent]) {
                int tmp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = tmp;
            }
        }
        heapifyBottomToTop(parent, heapType);
    }

    /**
     * Insert to Binary Heap.
     *
     * @param value    the value to insert to Binary Heap.
     * @param typeHeap the type of Binary Heap
     */
    public void insert(int value, String typeHeap) {
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, typeHeap);
        System.out.println("Inserted " + value + " successfully in Heap.");
    }

    /**
     * Heapify for extract/deletion.
     *
     * @param index    the current index
     * @param heapType the type of heap
     */
    public void heapifyTopToBottom(int index, String heapType) {
        int left = index * 2;
        int right = index * 2 + 1;
        int swapChild = 0;

        if (sizeOfTree < left) {
            return;
        }
        if (heapType == "Max") {
            if (sizeOfTree == left) {
                if (arr[index] < arr[left]) {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            } else {
                if (arr[left] > arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] < arr[swapChild]) {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
        } else if (heapType == "Min") {
            if (sizeOfTree == left) {
                if (arr[index] > arr[left]) {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            } else {
                if (arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] > arr[swapChild]) {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    /**
     * Extract head of type
     *
     * @param heapType the heap type
     * @return the head of the binary heap
     */
    public int extractHeadOfHeap(String heapType) {
        if (isEmpty()) {
            return -1;
        } else {
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1, heapType);
            return extractedValue;
        }
    }

    /**
     * Delete entire Binary Heap.
     */
    public void deleteBH() {
        arr = null;
        System.out.println("Binary Heap Successfully Deleted!");
    }

}
