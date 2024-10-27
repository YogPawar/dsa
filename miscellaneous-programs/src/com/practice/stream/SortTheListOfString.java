package com.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheListOfString {

  public static void main(String[] args) {
    List<String> l = new ArrayList<>();
    l.add("Hello");
    l.add("Hello World");
    l.add("Hello Riyu!");
    l.add("Greetings");

    l.stream().filter(s -> s.startsWith("Hello")).map(String::toUpperCase).sorted()
        .forEach(System.out::println);

    l.stream().filter(s -> s.startsWith("Hello")).sorted()
        .forEach(System.out::println);

  }

}
