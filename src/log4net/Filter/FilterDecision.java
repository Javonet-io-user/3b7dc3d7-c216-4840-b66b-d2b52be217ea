package log4net.Filter;

public enum FilterDecision {
  Neutral(0L),
  Accept(1L),
  Deny(-1L),
  ;
  private long numVal;

  FilterDecision(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
