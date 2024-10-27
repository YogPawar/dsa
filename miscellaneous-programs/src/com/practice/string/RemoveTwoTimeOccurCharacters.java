package com.practice.string;

import java.io.CharConversionException;
import java.nio.channels.Channel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveTwoTimeOccurCharacters {

  /**
   * It will remove the duplicate but order will change and it will display the output in assending
   * order.
   *
   * @param input
   * @return
   */
  private static String removeDuplicate(String input) {
    // Create a frequency map
    Map<Character, Integer> frequency = new HashMap<>();

    // Count occurrences of each character
    for (char ch : input.toCharArray()) {
      frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
    }

    // Build the new string without characters that occur exactly twice
    StringBuilder newString = new StringBuilder();
    for (char ch : input.toCharArray()) {
      if (frequency.get(ch) != 2) {
        newString.append(ch);
      }
    }

    return newString.toString();
  }

  public static void main(String[] args) {
    String str = "pawaryog03@gmail.com";
    System.out.println(removeDuplicate(str));
    System.out.println(remove(str));

  }

  private static String remove(String str) {
    Map<Character, Integer> removeDuplicate = new HashMap<>();
    for (char ch : str.toCharArray()) {
      removeDuplicate.put(ch, removeDuplicate.getOrDefault(ch, 0) + 1);
    }
    StringBuilder sb = new StringBuilder();
    for (char ch : str.toCharArray()) {
      if (removeDuplicate.get(ch) == 1) {
        sb.append(ch);
      }
    }
    return sb.toString();
  }

}
