package com.sd.solid.oc;

import com.sd.solid.srp.Invoice;
import com.sd.solid.oc.InvoiceDAO;

public class FileInvoiceDAO implements InvoiceDAO {

  @Override
  public void save(Invoice invoice) {
    System.out.println("Saved into File System");
  }
}
