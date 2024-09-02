package com.java.lambda;

public class RunnablePractice {

  private static void beforeJava8Runnable() {
    Runnable run =
        new Runnable() {
          @Override
          public void run() {
            System.out.println("Before run");
          }
        };

    new Thread(run).start();
  }

  private static void afterJava8() {
    Runnable run = () -> System.out.println("Java 8 Runnable");
    new Thread(run).start();

    // mode optimize for above code
    new Thread(() -> System.out.println("Optimized java 8")).start();
  }

  public static void main(String[] args) {
    beforeJava8Runnable();
    afterJava8();
  }
}
