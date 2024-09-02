package com.java.lambda;

import java.util.Comparator;

public class ComparatorPractice {

  /**
   * How comparator works
   *
   * <p>return 0 if o1== o2
   *
   * <p>return 1 if o1>02
   *
   * <p>return -1 if o1<02
   */
  private static void beforJava8() {
    // Comparator
    Comparator<Integer> comparator =
        new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
            if (o1 > o2) {
              return o1;
            } else {
              return o2;
            }
          }
        };
    System.out.println(comparator.compare(22, 3));
  }

  public static void main(String[] args) {
    priortojava7();
    afterjava8();
  }

  private static void afterjava8() {
    Comparator<Integer> comparator =
        (Integer a, Integer b) -> {
          return a.compareTo(b);
        };
    System.out.println("After java 8 " + comparator.compare(2, 3));
  }

  public static void priortojava7() {
    Comparator<Integer> comparator =
        new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
          }
        };
    System.out.println("Result of comparator is : " + comparator.compare(2, 3));
  }
}
