package com.java.lambda.funcational;

import java.util.function.Consumer;

public class ConsumerPractice {
  private static Consumer<String> changeCase = (s) -> System.out.println(s.toUpperCase());

  public static void main(String[] args) {
    changeCase.accept("yogesh");
  }
}
