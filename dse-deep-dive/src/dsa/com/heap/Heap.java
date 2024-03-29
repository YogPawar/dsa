package dsa.com.heap;

import java.util.Arrays;

public class Heap {

  private int size;
  private int[] heap;

  Heap(int capacity) {
    heap = new int[capacity];
  }

  public boolean isFull() {
    return size == heap.length;
  }

  public int getParent(int index) {
    return (index - 1) / 2;
  }

  private void fixHeapAbove(int index) {
    int newValue = heap[index];
    while (index > 0 && newValue > heap[getParent(index)]) { //swap the value if parent is less
      // new value
      heap[index] = heap[getParent(index)];
      index = getParent(index);
    }
    heap[index] = newValue;
  }

  public void insert(int value) {
    if (isFull()) {
      throw new IndexOutOfBoundsException("Heap is Full");
    }
    heap[size] = value;
    fixHeapAbove(size);
    size++;
  }

  public int getChild(int index, boolean left) {
    return 2 * index + (left ? 1 : 2);
  }

  public int delete(int index) {
    if (isEmpty()) {
      throw new IndexOutOfBoundsException("Heap is empty");
    }
    int parent = getParent(index);
    int deleteValue = heap[index];
    heap[index] = heap[size - 1];

    if (index == 0 || heap[index] < heap[parent]) {
      fixHeapBelow(index, size - 1);
    } else {
      fixHeapAbove(index);
    }
    size--;
    return deleteValue;
  }

  public void printHeap() {
    System.out.println(Arrays.toString(heap));
  }

  private void fixHeapBelow(int index, int lastHeapIndex) {
    int childToSwap;

    while (index <= lastHeapIndex) {
      int leftChild = getChild(index, true);
      int rightChild = getChild(index, false);
      if (leftChild <= lastHeapIndex) {
        if (rightChild > lastHeapIndex) {
          childToSwap = leftChild;
        } else {
          childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
        }

        if (heap[index] < heap[childToSwap]) {
          int tmp = heap[index];
          heap[index] = heap[childToSwap];
          heap[childToSwap] = tmp;
        } else {
          break;
        }

        index = childToSwap;
      } else {
        break;
      }
    }
  }

  private boolean isEmpty() {
    return size < 1;
  }

  public int peek() {
    if (isEmpty()) {
      throw new IndexOutOfBoundsException("Heap is empty");
    }
    return heap[0];
  }

  public void sort() {
    int lastHeapIndex = size - 1;
    for (int i = 0; i < lastHeapIndex; i++) {
      int temp = heap[0];
      heap[0] = heap[lastHeapIndex - i];
      heap[lastHeapIndex - i] = temp;

      fixHeapBelow(0, lastHeapIndex - i - 1);

    }
  }
}
