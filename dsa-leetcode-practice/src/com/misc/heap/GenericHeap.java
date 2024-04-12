package com.misc.heap;

import com.misc.graphs.GenericGraph;
import java.util.ArrayList;
import java.util.List;

public class GenericHeap {

  private final ArrayList<Integer> heap = new ArrayList<>();

  public static void main(String[] args) {
    GenericHeap heap = new GenericHeap();
    heap.insert(10);
    heap.insert(4);
    heap.insert(2);
    heap.insert(25);
    heap.insert(100);
    heap.showHeap();
    heap.remove();
    heap.showHeap();
    heap.remove();
    heap.showHeap();
  }

  private int parent(int childIndex) {
    return childIndex / 2;
  }

  private int leftChild(int parentIndex) {
    return 2 * parentIndex + 1;
  }

  private int rightChild(int parentIndex) {
    return 2 * parentIndex + 2;
  }

  private List<Integer> getHeap() {
    return new ArrayList<>(heap);
  }

  private void swap(int parentIndex, int childIndex) {
    int temp = heap.get(parentIndex);
    heap.set(parentIndex, heap.get(childIndex));
    heap.set(childIndex, temp);
  }

  public void insert(int value) {
    //insert at end of the heap.
    heap.add(value);
    int current = heap.size() - 1;
    while (current > 0 && heap.get(current) > heap.get(parent(current))) {
      swap(parent(current), current);
      current = parent(current);
    }
  }

  public void showHeap() {
    System.out.println(heap);
  }

  public Integer remove() {
    if (heap.size() == 0) {
      return 0;
    }
    if (heap.size() == 1) {
      return heap.remove(0);
    }
    int maxValue = heap.get(0);
    heap.set(0, heap.remove(heap.size() - 1));
    sinkdown(0);
    return maxValue;
  }

  private void sinkdown(int index) {
    int maxIndex = index;

    while (true) {
      int leftIndex = leftChild(index);
      int rightIndex = rightChild(index);
      if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
        maxIndex = leftIndex;
      }

      if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
        maxIndex = rightIndex;
      }
      if (maxIndex != index) {
        swap(index, maxIndex);
        index = maxIndex;
      } else {
        return;
      }
    }
  }
}

