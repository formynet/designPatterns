package com.sgandi.patterns.structural.bridge;

import static java.lang.invoke.MethodHandles.lookup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface IAbstractor {
  void operation();
}


class Abstractor implements IPlatformIndependent {
  private IIPlatformDependentImplementor impl;

  public Abstractor(IIPlatformDependentImplementor impl) {
    this.impl = impl;
  }

  @Override
  public void operation() {
    impl.operationImpl();
  }

}


interface IImplementor {
  public void operationImpl();
}


class Implementor1 implements IIPlatformDependentImplementor {
  static final Logger log = LoggerFactory.getLogger(lookup().lookupClass());

  @Override
  public void operationImpl() {
    log.info("in impl1, operation implementation..");
  }
}


class Implementor2 implements IIPlatformDependentImplementor {
  static final Logger log = LoggerFactory.getLogger(lookup().lookupClass());

  @Override
  public void operationImpl() {
    log.info("in impl2, operation implementation..");
  }
}


public class BridgeDemo {

  public static void main(String[] args) {
    PlatformDependentImplementor impl1 = new PlatformDependentImplementor();
    PlatformDependentImplementor2 impl2 = new PlatformDependentImplementor2();

    IPlatformIndependent abs = new Abstractor(impl1);

    abs.operation();
    abs = new Abstractor(impl2);
    abs.operation();
  }
}
