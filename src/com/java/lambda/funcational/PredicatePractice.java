package com.java.lambda.funcational;

import java.util.function.Predicate;

public class PredicatePractice {

  static Predicate<Integer> p1 =
      num -> {
        return num % 2 == 0;
      };

  static Predicate<Integer> p2 =
      num -> {
        return num % 5 == 0;
      };

  public static void predicateOr() {
    System.out.println("predicateOr and result is " + p1.or(p2).test(10)); // division by 2 and 5
    System.out.println("predicateOr and result is " + p1.or(p2).test(15)); // division by only 5
    System.out.println("predicateOr and result is " + p1.or(p2).test(6)); // division by only 2
    System.out.println("predicateOr and result is " + p1.or(p2).test(7)); // division by none
  }

  public static void predicateAnd() {
    System.out.println("predicateOr and result is " + p1.and(p2).test(10)); // division by 2 and 5
    System.out.println("predicateOr and result is " + p1.and(p2).test(15)); // division by only 5
    System.out.println("predicateOr and result is " + p1.and(p2).test(6)); // division by only 2
    System.out.println("predicateOr and result is " + p1.and(p2).test(7)); // division by none
  }

  public static void predicateNegate() {
    System.out.println("predicateOr and result is " + p1.negate().test(10)); // division by 2 and 5
    System.out.println("predicateOr and result is " + p1.negate().test(15)); // division by only 5
    System.out.println("predicateOr and result is " + p1.negate().test(6)); // division by only 2
    System.out.println("predicateOr and result is " + p1.negate().test(7)); // division by none
  }

  public static void main(String[] args) {
    predicateAnd();
    predicateNegate();
  }

  static boolean isEven(int num) {
    Predicate<Integer> evenOrOdd =
        (number) -> {
          return number % 2 == 0;
        };
    return evenOrOdd.test(num);
  }
}
