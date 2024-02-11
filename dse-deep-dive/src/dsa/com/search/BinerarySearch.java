package dsa.com.search;

public class BinerarySearch {

  public int search(int[] input, int value) {
    int start = 0;
    int end = input.length;

    while (start < end) {
      int midPoint = (start + end) / 2;
      if (input[midPoint] == value) {
        return midPoint;
      } else if (input[midPoint] < value) {
        start = midPoint + 1;
      } else {
        end = midPoint;
      }
    }
    return -1;
  }

  public int recursiveBineraySearch(int[] input, int value) {
    return recursiveBineraySearch(input, 0, input.length, value);
  }

  public int recursiveBineraySearch(int[] input, int start, int end, int value) {
    if (start >= end) {
      return -1;
    }
    int midPoint = (start + end) / 2;
    if (input[midPoint] == value) {
      return midPoint;
    } else if (input[midPoint] > value) {
      return recursiveBineraySearch(input, start, midPoint, value);

    } else {
      return recursiveBineraySearch(input, midPoint + 1, end, value);

    }
  }
}
