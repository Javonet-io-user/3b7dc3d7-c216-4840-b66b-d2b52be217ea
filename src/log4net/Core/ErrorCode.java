package log4net.Core;

public enum ErrorCode {
  GenericFailure(0L),
  WriteFailure(1L),
  FlushFailure(2L),
  CloseFailure(3L),
  FileOpenFailure(4L),
  MissingLayout(5L),
  AddressParseFailure(6L),
  ;
  private long numVal;

  ErrorCode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
