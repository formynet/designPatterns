package com.sgandi.patterns.behavioral.strategy.sampleByJavaComparator;


public class Name implements Comparable<Name> {
  private final String firstName;
  private final String lastName;

  // ...
  public Name(String firstName, String lastName) {
    if (firstName == null || lastName == null)
      throw new NullPointerException();
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Name))
      return false;
    Name name = (Name) o;
    return name.firstName.equals(firstName) && name.lastName.equals(lastName);
  }

  @Override
  public int hashCode() {
    return 31 * firstName.hashCode() + lastName.hashCode();
  }

  @Override
  public String toString() {
    return firstName + " " + lastName;
  }

  // The compareTo method implements the Comparable interface.
  // It defines the "natural ordering" (default ordering).
  @Override
  public int compareTo(Name name) {
    int cmp = lastName.compareTo(name.lastName);
    if (cmp != 0)
      return cmp;
    // Last names are equal, compare first names.
    return firstName.compareTo(name.firstName);
  }

  //
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}
