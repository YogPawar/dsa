package com.sd.solid.srp;

/**
 * Benefits of SRP :
 * Easy to maintain
 * Easy to Understand
 *
 */
public class Marker {

  String name;
  int price;
  int year;
  String color;

  public Marker(String name, String color, int price, int year) {
    this.name = name;
    this.price = price;
    this.year = year;
    this.color = color;
  }

}
