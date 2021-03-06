/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
/** A pair of strings. */
@org.apache.avro.specific.AvroGenerated
public class StringPair extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"StringPair\",\"doc\":\"A pair of strings.\",\"fields\":[{\"name\":\"FirstName\",\"type\":\"string\"},{\"name\":\"LastName\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence FirstName;
  @Deprecated public java.lang.CharSequence LastName;

  /**
   * Default constructor.
   */
  public StringPair() {}

  /**
   * All-args constructor.
   */
  public StringPair(java.lang.CharSequence FirstName, java.lang.CharSequence LastName) {
    this.FirstName = FirstName;
    this.LastName = LastName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return FirstName;
    case 1: return LastName;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: FirstName = (java.lang.CharSequence)value$; break;
    case 1: LastName = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'FirstName' field.
   */
  public java.lang.CharSequence getFirstName() {
    return FirstName;
  }

  /**
   * Sets the value of the 'FirstName' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.FirstName = value;
  }

  /**
   * Gets the value of the 'LastName' field.
   */
  public java.lang.CharSequence getLastName() {
    return LastName;
  }

  /**
   * Sets the value of the 'LastName' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.LastName = value;
  }

  /** Creates a new StringPair RecordBuilder */
  public static StringPair.Builder newBuilder() {
    return new StringPair.Builder();
  }
  
  /** Creates a new StringPair RecordBuilder by copying an existing Builder */
  public static StringPair.Builder newBuilder(StringPair.Builder other) {
    return new StringPair.Builder(other);
  }
  
  /** Creates a new StringPair RecordBuilder by copying an existing StringPair instance */
  public static StringPair.Builder newBuilder(StringPair other) {
    return new StringPair.Builder(other);
  }
  
  /**
   * RecordBuilder for StringPair instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<StringPair>
    implements org.apache.avro.data.RecordBuilder<StringPair> {

    private java.lang.CharSequence FirstName;
    private java.lang.CharSequence LastName;

    /** Creates a new Builder */
    private Builder() {
      super(StringPair.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(StringPair.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing StringPair instance */
    private Builder(StringPair other) {
            super(StringPair.SCHEMA$);
      if (isValidValue(fields()[0], other.FirstName)) {
        this.FirstName = data().deepCopy(fields()[0].schema(), other.FirstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.LastName)) {
        this.LastName = data().deepCopy(fields()[1].schema(), other.LastName);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'FirstName' field */
    public java.lang.CharSequence getFirstName() {
      return FirstName;
    }
    
    /** Sets the value of the 'FirstName' field */
    public StringPair.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.FirstName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'FirstName' field has been set */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'FirstName' field */
    public StringPair.Builder clearFirstName() {
      FirstName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'LastName' field */
    public java.lang.CharSequence getLastName() {
      return LastName;
    }
    
    /** Sets the value of the 'LastName' field */
    public StringPair.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.LastName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'LastName' field has been set */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'LastName' field */
    public StringPair.Builder clearLastName() {
      LastName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public StringPair build() {
      try {
        StringPair record = new StringPair();
        record.FirstName = fieldSetFlags()[0] ? this.FirstName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.LastName = fieldSetFlags()[1] ? this.LastName : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
