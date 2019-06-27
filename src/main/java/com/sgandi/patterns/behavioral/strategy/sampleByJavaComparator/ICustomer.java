package com.sgandi.patterns.behavioral.strategy.sampleByJavaComparator;

import java.util.Date;

public interface ICustomer extends Comparable<ICustomer> {
  int getId();

  Name getName();

  PhoneNumber getPhoneNumber();

  Date getBirthday();
}
