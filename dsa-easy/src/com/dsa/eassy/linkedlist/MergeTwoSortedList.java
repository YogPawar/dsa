package com.dsa.eassy.linkedlist;

/**
 * Leetcode  No : 21 Link :
 * https://leetcode.com/problems/merge-two-sorted-lists/submissions/1414279101/
 */
public class MergeTwoSortedList {

  private static ListNode mergeList(ListNode list1, ListNode list2) {
    //recursion will need base case.
    if (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        list1.next = mergeList(list1.next, list2);
        return list1;
      } else {
        list2.next = mergeList(list1, list2.next);
        return list2;
      }
    }
    return (list1 != null) ? list1 : list2;
  }

  public static void main(String[] args) {
    ListNode list1 = new ListNode(1);
    list1.next = new ListNode(2);
    list1.next.next = new ListNode(3);
    list1.next.next.next = new ListNode(4);

    ListNode list2 = new ListNode(1);
    list2.next = new ListNode(4);
    list2.next.next = new ListNode(5);
    list2.next.next.next = new ListNode(6);

    System.out.println("List 1 : " + list1);
    System.out.println("List 2 : " + list2);

    System.out.println(mergeList(list1, list2));


  }


}
