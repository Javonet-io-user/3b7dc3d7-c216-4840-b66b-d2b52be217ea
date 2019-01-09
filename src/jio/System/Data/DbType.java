package jio.System.Data;

public enum DbType {
  AnsiString(0L),
  Binary(1L),
  Byte(2L),
  Boolean(3L),
  Currency(4L),
  Date(5L),
  DateTime(6L),
  Decimal(7L),
  Double(8L),
  Guid(9L),
  Int16(10L),
  Int32(11L),
  Int64(12L),
  Object(13L),
  SByte(14L),
  Single(15L),
  String(16L),
  Time(17L),
  UInt16(18L),
  UInt32(19L),
  UInt64(20L),
  VarNumeric(21L),
  AnsiStringFixedLength(22L),
  StringFixedLength(23L),
  Xml(25L),
  DateTime2(26L),
  DateTimeOffset(27L),
  ;
  private long numVal;

  DbType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
