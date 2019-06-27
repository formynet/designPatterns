package com.sgandi.patterns.behavioral.visitor.basic;

public interface Visitable {
  void visitElementA(ElementA element);

  void visitElementB(ElementB element);

  void visitElementC(ElementC element);
}
