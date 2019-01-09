package jio.System.Diagnostics;

public enum EventLogEntryType {
  Error(1L),
  Warning(2L),
  Information(4L),
  SuccessAudit(8L),
  FailureAudit(16L),
  ;
  private long numVal;

  EventLogEntryType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
