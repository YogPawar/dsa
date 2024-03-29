package dsa.com.queue.solutions;

import java.util.LinkedList;

public class PalindromString {

  /**
   * Backing by LinkedList (Stack)>
   *
   * @param input
   * @return
   */
  public static boolean isPalindrom(String input) {
    LinkedList<Character> stack = new LinkedList<>(); //backed by stack
    StringBuilder modification = new StringBuilder(input.length());
    for (int i = 0; i < input.length(); i++) {
      char ch = input.toLowerCase().charAt(i);
      if (ch >= 'a' && ch <= 'z') {
        modification.append(ch);
        stack.push(ch);
      }
    }

    StringBuilder reversString = new StringBuilder(input.length());
    while (!stack.isEmpty()) {
      reversString.append(stack.pop());
    }
    return modification.toString().equals(reversString.toString());
  }

  public static void main(String[] args) {

    String str = "I did,did i?";
    //String str = "hello";
    System.out.println(isPalindrom(str));
    System.out.println(isPalin(str));

    //  System.out.println('z' + 0);

  }

  /**
   * Check String is palindrom or not using Stack and Queue
   *
   * @param str
   * @return
   */
  public static boolean isPalin(String str) {
    LinkedList<Character> stack = new LinkedList<>();
    LinkedList<Character> queue = new LinkedList<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.toLowerCase().charAt(i);
      if (ch >= 'a' && ch <= 'z') {
        stack.push(ch);
        queue.add(ch);
      }
    }
    while (!stack.isEmpty() && !queue.isEmpty()) {
      if (!queue.removeFirst().toString().equals(stack.pop().toString())) {
        return false;
      }
    }
    return true;
  }


}