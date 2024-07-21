package com.book.dsa.recursion;

public class ToweOfHanoi {

  private static void towerOfHanoi(int plates, char source, char destination, char auxiliary) {
    //base case
    if (plates == 0) {
      return;
    }
    //Move From n-1 from source to destination with help of auxiliary
    towerOfHanoi(plates - 1, source, auxiliary, destination);
    System.out.println(
        "Move Disk [" + plates + "] from source : " + source + " to Destination : " + destination);

    towerOfHanoi(plates - 1, auxiliary, destination, source);

  }

  public static void main(String[] args) {
    towerOfHanoi(3, 'A', 'C', 'B');
  }

}
