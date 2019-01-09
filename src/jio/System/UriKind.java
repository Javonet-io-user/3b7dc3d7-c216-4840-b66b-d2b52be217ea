package jio.System;

public enum UriKind {
  RelativeOrAbsolute(0L),
  Absolute(1L),
  Relative(2L),
  ;
  private long numVal;

  UriKind(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
