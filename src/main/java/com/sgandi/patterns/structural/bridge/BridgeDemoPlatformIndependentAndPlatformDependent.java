package com.sgandi.patterns.structural.bridge;

// An example of platform independent abstractions would be views such as LongFormFactorView and
// ShortFormFactorView which encapsulate
// platform dependent interface for different resources to be viewed such as Author/Book/Artist and
// delegate the resource viewing at
// run time to platform dependent implementations
import static java.lang.invoke.MethodHandles.lookup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface IPlatformIndependent {
  void operation();
}


class PlatformIndependent1 implements IPlatformIndependent {
  private IIPlatformDependentImplementor impl;

  public PlatformIndependent1(IIPlatformDependentImplementor impl) {
    this.impl = impl;
  }


  @Override
  public void operation() {
    impl.operationImpl();
  }

}


interface IIPlatformDependentImplementor {
  public void operationImpl();
}


class PlatformDependentImplementor implements IIPlatformDependentImplementor {
  static final Logger log = LoggerFactory.getLogger(lookup().lookupClass());

  @Override
  public void operationImpl() {
    log.info("in impl1, operation implementation..");
  }
}


class PlatformDependentImplementor2 implements IIPlatformDependentImplementor {
  static final Logger log = LoggerFactory.getLogger(lookup().lookupClass());

  @Override
  public void operationImpl() {
    log.info("in impl2, operation implementation..");
  }
}


public class BridgeDemoPlatformIndependentAndPlatformDependent {

  public static void main(String[] args) {
    IIPlatformDependentImplementor impl1 = new PlatformDependentImplementor();
    IIPlatformDependentImplementor impl2 = new PlatformDependentImplementor2();

    IPlatformIndependent abs = new PlatformIndependent1(impl1);

    abs.operation();
    abs = new PlatformIndependent1(impl2);
    abs.operation();
  }
}
