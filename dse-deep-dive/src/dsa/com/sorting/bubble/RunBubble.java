package dsa.com.sorting.bubble;

import java.util.Arrays;

public class RunBubble {

  public static void main(String[] args) {
    BubbleSort bs = new BubbleSort();
    ;

    int[] unsortedArray = {5, 2, 6, 87, 6, -2, 2, 43};
    bs.bubbleSort(unsortedArray);
    System.out.println(Arrays.toString(unsortedArray));
  }

}