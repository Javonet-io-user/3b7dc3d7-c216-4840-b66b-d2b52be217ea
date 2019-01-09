package jio.System.Net.Mail;

public enum MailPriority {
  Normal(0L),
  Low(1L),
  High(2L),
  ;
  private long numVal;

  MailPriority(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
