package com.sd.solid.isp;

public class Waiter implements WaiterInterface {

  @Override
  public void serveCustomer() {
    System.out.println("Serving the customer");
  }
}
