package com.practice.solid.oc;

import com.practice.solid.srp.Invoice;
import com.practice.solid.srp.InvoiceDAO;

public class FileInvoiceDAO extends InvoiceDAO {

  public FileInvoiceDAO(Invoice invoice) {
    super(invoice);
  }

  @Override
  public void save(Invoice invoice) {
    System.out.println("Saved into File System");
  }
}
