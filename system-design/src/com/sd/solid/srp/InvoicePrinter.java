package com.sd.solid.srp;

public class InvoicePrinter {

  private final Invoice invoice;

  public InvoicePrinter(Invoice invoice) {
    this.invoice = invoice;
  }

  public void print() {
    System.out.println("Print the invoice" + invoice.calculateTotal());
  }

}
