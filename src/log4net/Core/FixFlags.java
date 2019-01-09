package log4net.Core;

public enum FixFlags {
  None(0L),
  Mdc(1L),
  Ndc(2L),
  Message(4L),
  ThreadName(8L),
  LocationInfo(16L),
  UserName(32L),
  Domain(64L),
  Identity(128L),
  Exception(256L),
  Properties(512L),
  Partial(844L),
  All(268435455L),
  ;
  private long numVal;

  FixFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
