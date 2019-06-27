package com.sgandi.patterns.behavioral.strategy.sampleByJavaComparator;

import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

  private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().getClass());

  public static void main(String[] args) throws Exception {
    // Creating the customers.
    List<ICustomer> customerList = CustomersUtil.createTestData(3);

    log.info("SORTING CUSTOMERS:\n\n" + "(1) by using the default comparator \n"
        + "    = according to the customer ID: ");
    Collections.sort(customerList);
    log.info(customerList.toString());

    log.info("\n" + "(2) by specifying the NAME comparator \n"
        + "    = according to the customer name: ");
    Collections.sort(customerList, CustomersUtil.NAME);
    log.info(customerList.toString());

    // Implementing individual requirements directly, for example:
    log.info("\n" + "(3) by implementing the comparator directly \n"
        + "    = according to the (area code) of the customer phone number \n"
        + "      and the customer name: ");
    Collections.sort(customerList, new Comparator<ICustomer>() { // inner class
      @Override
      public int compare(ICustomer c1, ICustomer c2) {
        // Implementing the comparator interface / compare().
        if (c1.getPhoneNumber().getAreaCode() < c2.getPhoneNumber().getAreaCode())
          return -1;
        if (c1.getPhoneNumber().getAreaCode() > c2.getPhoneNumber().getAreaCode())
          return 1;

        return (c1.getName().compareTo(c2.getName()));
      }
    });
    log.info(customerList.toString());

    log.info("\n" + "(4) by specifying the BIRTHDAY comparator \n"
        + "    = according to the customer birthday descending: ");
    Collections.sort(customerList, CustomersUtil.BIRTHDAY);
    log.info(customerList.toString());
  }
}
