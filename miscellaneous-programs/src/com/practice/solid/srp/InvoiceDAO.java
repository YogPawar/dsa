package com.practice.solid.srp;

public class InvoiceDAO {

  private final Invoice invoice;

  public InvoiceDAO(Invoice invoice) {
    this.invoice = invoice;
  }

  public void save(Invoice invoice) {
    System.out.println("Saved the invoice into DB");
  }

}
