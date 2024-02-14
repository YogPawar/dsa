package dsa.com.heap;

import java.util.PriorityQueue;

public class PriorityQ {

  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(45);
    pq.add(55);
    pq.add(67);
    pq.add(-23);
    pq.add(567);

    System.out.println(pq.peek());
    System.out.println(pq.poll());
  }

}
