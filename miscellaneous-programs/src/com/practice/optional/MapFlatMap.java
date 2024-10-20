package com.practice.optional;

import java.util.Optional;

public class MapFlatMap {

  private static void nonEmptyMap() {
    Optional<String> optionalString = Optional.of("Yogesh");
    Optional<Integer> length = optionalString.map(String::length);
    System.out.println(length); //Output : Optional[6]
  }

  private static void emptyMap() {
    Optional<String> optionalString = Optional.empty();
    Optional<Integer> length = optionalString.map(String::length);
    System.out.println(length); //Output : Optional.empty()
  }

  public static void main(String[] args) {
    nonEmptyMap();
    emptyMap();


  }

}
