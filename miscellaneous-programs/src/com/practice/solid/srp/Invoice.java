package com.practice.solid.srp;

public class Invoice {

  private final Marker marker; //has a relationship Invoice has a Marker
  private final int quantity;

  public Invoice(Marker marker, int quantity) {
    this.marker = marker;
    this.quantity = quantity;
  }

  public int calculateTotal() {
    return this.quantity * marker.price;
  }

 /*
  If we keep the below methods in this Invoice class then we are violating the
  SRP rule as in case if we want to save the details in file or any other
  location then we will need to do the changes in this class which is not
  relevant to invoice. Therefore, we will keep this methods in separate classes.
  public void printInvoice(){
    System.out.println("Invoice details");
  }

  public void saveToDB(){
    System.out.println("Record Save into DB");
  }*/

}
