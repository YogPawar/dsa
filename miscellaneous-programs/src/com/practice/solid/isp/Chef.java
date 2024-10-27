package com.practice.solid.isp;

public class Chef implements ChefInterface {

  @Override
  public void cookFood() {
    System.out.println("Prepare the food");
  }
}
