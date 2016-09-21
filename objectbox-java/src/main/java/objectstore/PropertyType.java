// automatically generated by the FlatBuffers compiler, do not modify

package objectstore;

public final class PropertyType {
  private PropertyType() { }
  /**
   * Not a real type, just best practice (e.g. forward compatibility)
   */
  public static final byte Unknown = 0;
  public static final byte Bool = 1;
  public static final byte Byte = 2;
  public static final byte Short = 3;
  public static final byte Char = 4;
  public static final byte Int = 5;
  public static final byte Long = 6;
  public static final byte Float = 7;
  public static final byte Double = 8;
  public static final byte String = 9;
  /**
   * Internally stored as a 64 bit long(?)
   */
  public static final byte Date = 10;
  /**
   * Reference to another entity (FK in relational DBs)
   */
  public static final byte Reference = 11;
  public static final byte Reserved1 = 12;
  public static final byte Reserved2 = 13;
  public static final byte Reserved3 = 14;
  public static final byte Reserved4 = 15;
  public static final byte Reserved5 = 16;
  public static final byte Reserved6 = 17;
  public static final byte Reserved7 = 18;
  public static final byte Reserved8 = 19;
  public static final byte Reserved9 = 20;
  public static final byte Reserved10 = 21;
  public static final byte BoolVector = 22;
  public static final byte ByteVector = 23;
  public static final byte ShortVector = 24;
  public static final byte CharVector = 25;
  public static final byte IntVector = 26;
  public static final byte LongVector = 27;
  public static final byte FloatVector = 28;
  public static final byte DoubleVector = 29;
  public static final byte StringVector = 30;
  public static final byte DateVector = 31;

  public static final String[] names = { "Unknown", "Bool", "Byte", "Short", "Char", "Int", "Long", "Float", "Double", "String", "Date", "Reference", "Reserved1", "Reserved2", "Reserved3", "Reserved4", "Reserved5", "Reserved6", "Reserved7", "Reserved8", "Reserved9", "Reserved10", "BoolVector", "ByteVector", "ShortVector", "CharVector", "IntVector", "LongVector", "FloatVector", "DoubleVector", "StringVector", "DateVector", };

  public static String name(int e) { return names[e]; }
}
