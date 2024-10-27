package com.practice.solid.isp;

public class HouseKeeping implements HouseKeepingInterface {

  @Override
  public void washDishes() {
    System.out.println("Washing Dishes");
  }
}
