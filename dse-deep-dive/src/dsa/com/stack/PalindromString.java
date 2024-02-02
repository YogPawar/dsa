package dsa.com.stack;

import java.util.LinkedList;
import java.util.Stack;

public class PalindromString {

  public static boolean isPalindrome(String str) {
    String removSpecialChar = str.replaceAll("[^a-zA-Z0-9]", "");
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < removSpecialChar.length(); i++) {
      stack.push(removSpecialChar.charAt(i));
    }

    for (int i = 0; i < removSpecialChar.length(); i++) {
      if (removSpecialChar.charAt(i) != stack.pop()) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPalind(String in) {
    LinkedList<Character> stack = new LinkedList<>();
    String str = in.toLowerCase();
    StringBuilder withoutPunctuation = new StringBuilder(str.length());
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch >= 'a' && ch <= 'z') {
        withoutPunctuation.append(ch);
        stack.push(ch);
      }
    }

    StringBuilder reversString = new StringBuilder(stack.size());
    while (!stack.isEmpty()) {
      reversString.append(stack.pop());
    }

    return reversString.toString().equals(withoutPunctuation.toString());

  }

  public static void main(String[] args) {
    String str = "I did, did I?";
    System.out.println(isPalindrome(str));
    System.out.println("Test : " + isPalind(str));

    String str2 = "Racecar";
    System.out.println(isPalindrome(str2.toLowerCase()));
    System.out.println("Test : " + isPalind(str2));

    String str3 = "hello";
    System.out.println(isPalindrome(str3));
    System.out.println("Test : " + isPalind(str3));


  }

}
