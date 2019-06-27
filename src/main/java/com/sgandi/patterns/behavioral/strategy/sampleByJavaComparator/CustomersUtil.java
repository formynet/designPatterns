package com.sgandi.patterns.behavioral.strategy.sampleByJavaComparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class CustomersUtil {
  private static final SimpleDateFormat DATEFORMATTER = new SimpleDateFormat("dd.MM.yyyy");

  private CustomersUtil() {
    throw new IllegalStateException("utility class. no need to instantiate");
  }

  public static final Comparator<ICustomer> NAME = Comparator.comparing(ICustomer::getName);
  public static final Comparator<ICustomer> PHONE = Comparator.comparing(ICustomer::getPhoneNumber);
  public static final Comparator<ICustomer> BIRTHDAY = Comparator.comparing(ICustomer::getBirthday);

  public static List<ICustomer> createTestData(int size) throws Exception {
    List<ICustomer> customerList = new ArrayList<>(size);
    customerList.add(new Customer1(1, new Name("FirstName1", " LastName1"),
        new PhoneNumber(1, 2, 2), DATEFORMATTER.parse("03.03.1980")));
    customerList.add(new Customer1(2, new Name("FirstName3", " LastName3"),
        new PhoneNumber(1, 3, 3), DATEFORMATTER.parse("01.01.1970")));
    customerList.add(new Customer1(3, new Name("FirstName2", " LastName2"),
        new PhoneNumber(2, 1, 1), DATEFORMATTER.parse("02.02.1980")));
    return customerList;
  }

  public static void checkData(int id, Name name, PhoneNumber pn, Date birthday)
      throws ParseException {
    if (id < 0)
      throw new IllegalArgumentException("Customer ID is negative");
    if (birthday.compareTo(DATEFORMATTER.parse("01.01.1900")) < 0
        || birthday.compareTo(DATEFORMATTER.parse("01.01.2000")) > 0)
      throw new IllegalArgumentException("Birthday before 1900 or after 2000");
    // ...
  }
}
