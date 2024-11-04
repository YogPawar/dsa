package com.practice.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramGroups {

  private static void anagramGroups(List<String> inputList) {
    Map<String, List<String>> anagramGroups = inputList.stream().collect(Collectors.groupingBy(
        AnagramGroups::sortCharacters
    ));
    Map<String, List<String>> groups = inputList.stream()
        .collect(Collectors.groupingBy(AnagramGroups::sortCharacters));
    groups.forEach((key, group) -> System.out.println(key + " " + group));
    anagramGroups.forEach((key, group) -> System.out.println("Key : " + key + " Groups :" + group));
  }

  public static void main(String[] args) {
    List<String> words = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "god", "dog",
        "evil", "vile", "live", "art");

    anagramGroups(words);


  }

  private static String sortCharacters(String word) {
    char[] chars = word.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }

}
