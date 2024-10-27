package com.sd.solid.oc;

import com.sd.solid.srp.Invoice;
import com.sd.solid.srp.InvoiceDAO;

public class FileInvoiceDAO extends InvoiceDAO {

  public FileInvoiceDAO(Invoice invoice) {
    super(invoice);
  }

  @Override
  public void save(Invoice invoice) {
    System.out.println("Saved into File System");
  }
}
