package com.sgandi.patterns.behavioral.strategy.sampleByJavaComparator;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractCustomer implements ICustomer {

  private final int id;
  private final Name name;
  private final PhoneNumber phoneNumber;
  private final Date birthday;
  private static final SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");

  // TODO Check
  protected AbstractCustomer(int id, Name name, PhoneNumber pn, Date birthday) throws Exception {
    CustomersUtil.checkData(id, name, pn, birthday);
    this.id = id;
    this.name = name;
    this.phoneNumber = pn;
    this.birthday = birthday;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof ICustomer))
      return false;
    ICustomer c = (ICustomer) o;
    return c.getId() == id;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + id;
    return result;
  }

  @Override
  public String toString() {
    return "\nCustomer: " + id + "  " + name + "  " + phoneNumber + "  "
        + dateFormatter.format(birthday);
  }

  // The compareTo method implements the Comparable interface.
  // It defines the "natural ordering" (default ordering).
  public int compareTo(ICustomer c) {
    if (id < c.getId())
      return -1;
    if (id > c.getId())
      return 1;
    // All fields are equal.
    return 0;
  }

  //
  @Override
  public int getId() {
    return id;
  }

  @Override
  public Name getName() {
    return name;
  }

  @Override
  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  @Override
  public Date getBirthday() {
    return birthday;
  }
}
