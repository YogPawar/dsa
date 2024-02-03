package com.misc.linkedlist.solution;

public class BinaryToDecimalLL {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(1);
    ll.append(0);
    ll.append(1);
    ll.append(1);
    System.out.println("Decimal Number is : " + ll.convertToDecimal());
  }


}
