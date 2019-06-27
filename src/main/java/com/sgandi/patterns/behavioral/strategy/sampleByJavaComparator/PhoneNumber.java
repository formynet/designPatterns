package com.sgandi.patterns.behavioral.strategy.sampleByJavaComparator;

public class PhoneNumber implements Comparable<PhoneNumber> {
  private final int areaCode;
  private final int prefix;
  private final int lineNumber;

  public PhoneNumber(int areaCode, int prefix, int lineNumber) {
    rangeCheck(areaCode, 999, "areaCode");
    this.areaCode = areaCode;
    rangeCheck(prefix, 999, "prefix");
    this.prefix = prefix;
    rangeCheck(lineNumber, 999, "lineNumber");
    this.lineNumber = lineNumber;
  }

  private void rangeCheck(int number, int max, String name) {
    if (number < 0 || number > max) {
      throw new IllegalArgumentException(
          String.format("field %s value should be between 0 and %d", name, max));
    }
  }



  // The compareTo method implements the Comparable interface.
  // It defines the "natural ordering" (default ordering).
  @Override
  public int compareTo(PhoneNumber pn) {
    if (areaCode < pn.areaCode)
      return -1;
    if (areaCode > pn.areaCode)
      return 1;
    // Area codes are equal, compare prefixes.
    if (prefix < pn.prefix)
      return -1;
    if (prefix > pn.prefix)
      return 1;
    // Area codes and prefixes are equal, compare line numbers.
    if (lineNumber < pn.lineNumber)
      return -1;
    if (lineNumber > pn.lineNumber)
      return 1;
    // All fields are equal.
    return 0;
  }

  @Override
  public boolean equals(Object pn) {
    if (pn == null) {
      return false;
    }

    if (this.getClass() != pn.getClass()) {
      return false;
    }

    PhoneNumber pn1 = (PhoneNumber) pn;
    return this.areaCode == pn1.areaCode && this.prefix == pn1.prefix
        && this.lineNumber == pn1.lineNumber;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + areaCode;
    result = 31 * result + prefix;
    result = 31 * result + lineNumber;
    return result;
  }

  @Override
  public String toString() {
    return String.format("(%3d) %3d - %4d", this.areaCode, this.prefix, this.lineNumber);
  }

  public int getAreaCode() {
    return areaCode;
  }

  public int getPrefix() {
    return prefix;
  }

  public int getLineNumber() {
    return lineNumber;
  }



}
