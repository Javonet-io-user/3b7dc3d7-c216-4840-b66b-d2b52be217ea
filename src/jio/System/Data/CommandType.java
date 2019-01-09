package jio.System.Data;

public enum CommandType {
  Text(1L),
  StoredProcedure(4L),
  TableDirect(512L),
  ;
  private long numVal;

  CommandType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
