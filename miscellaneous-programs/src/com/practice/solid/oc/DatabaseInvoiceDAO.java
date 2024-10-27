package com.practice.solid.oc;

import com.practice.solid.srp.Invoice;
import com.practice.solid.srp.InvoiceDAO;

/**
 * OpenClose principle. Assume we have InvoiceDAO which is already tested and running into
 * production. Now when we want to add the feature to save the invoice into file then we will need
 * to add the that logic  into InvoiceDAO which is violating the OpenClose principle therefore
 * instead of doing the changes in already tested class we can extend that class and create a new
 * class to scale up  the system.
 */
public class DatabaseInvoiceDAO extends InvoiceDAO {

  public DatabaseInvoiceDAO(Invoice invoice) {
    super(invoice);
  }

  @Override
  public void save(Invoice invoice) {
    System.out.println("Save into DB");
  }
}
