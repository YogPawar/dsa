package com.practice.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumbersUsingThreadPool {

  public static void main(String[] args) {
    ExecutorService threadPool = Executors.newFixedThreadPool(5);
    for (int i = 1; i < 100; i++) {
      int num = i;
      threadPool.submit(() -> {
        System.out.println("Number : " + num + " Thread Name :" + Thread.currentThread().getName());
      });
    }
    threadPool.shutdown();
  }

}
