/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)")
public class SubmitOptions implements org.apache.thrift.TBase<SubmitOptions, SubmitOptions._Fields>, java.io.Serializable, Cloneable, Comparable<SubmitOptions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SubmitOptions");

  private static final org.apache.thrift.protocol.TField INITIAL_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("initial_status", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CREDS_FIELD_DESC = new org.apache.thrift.protocol.TField("creds", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SubmitOptionsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SubmitOptionsTupleSchemeFactory();

  private TopologyInitialStatus initial_status; // required
  private Credentials creds; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TopologyInitialStatus
     */
    INITIAL_STATUS((short)1, "initial_status"),
    CREDS((short)2, "creds");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INITIAL_STATUS
          return INITIAL_STATUS;
        case 2: // CREDS
          return CREDS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.CREDS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INITIAL_STATUS, new org.apache.thrift.meta_data.FieldMetaData("initial_status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TopologyInitialStatus.class)));
    tmpMap.put(_Fields.CREDS, new org.apache.thrift.meta_data.FieldMetaData("creds", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Credentials.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SubmitOptions.class, metaDataMap);
  }

  public SubmitOptions() {
  }

  public SubmitOptions(
    TopologyInitialStatus initial_status)
  {
    this();
    this.initial_status = initial_status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SubmitOptions(SubmitOptions other) {
    if (other.is_set_initial_status()) {
      this.initial_status = other.initial_status;
    }
    if (other.is_set_creds()) {
      this.creds = new Credentials(other.creds);
    }
  }

  public SubmitOptions deepCopy() {
    return new SubmitOptions(this);
  }

  @Override
  public void clear() {
    this.initial_status = null;
    this.creds = null;
  }

  /**
   * 
   * @see TopologyInitialStatus
   */
  public TopologyInitialStatus get_initial_status() {
    return this.initial_status;
  }

  /**
   * 
   * @see TopologyInitialStatus
   */
  public void set_initial_status(TopologyInitialStatus initial_status) {
    this.initial_status = initial_status;
  }

  public void unset_initial_status() {
    this.initial_status = null;
  }

  /** Returns true if field initial_status is set (has been assigned a value) and false otherwise */
  public boolean is_set_initial_status() {
    return this.initial_status != null;
  }

  public void set_initial_status_isSet(boolean value) {
    if (!value) {
      this.initial_status = null;
    }
  }

  public Credentials get_creds() {
    return this.creds;
  }

  public void set_creds(Credentials creds) {
    this.creds = creds;
  }

  public void unset_creds() {
    this.creds = null;
  }

  /** Returns true if field creds is set (has been assigned a value) and false otherwise */
  public boolean is_set_creds() {
    return this.creds != null;
  }

  public void set_creds_isSet(boolean value) {
    if (!value) {
      this.creds = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case INITIAL_STATUS:
      if (value == null) {
        unset_initial_status();
      } else {
        set_initial_status((TopologyInitialStatus)value);
      }
      break;

    case CREDS:
      if (value == null) {
        unset_creds();
      } else {
        set_creds((Credentials)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INITIAL_STATUS:
      return get_initial_status();

    case CREDS:
      return get_creds();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case INITIAL_STATUS:
      return is_set_initial_status();
    case CREDS:
      return is_set_creds();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SubmitOptions)
      return this.equals((SubmitOptions)that);
    return false;
  }

  public boolean equals(SubmitOptions that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_initial_status = true && this.is_set_initial_status();
    boolean that_present_initial_status = true && that.is_set_initial_status();
    if (this_present_initial_status || that_present_initial_status) {
      if (!(this_present_initial_status && that_present_initial_status))
        return false;
      if (!this.initial_status.equals(that.initial_status))
        return false;
    }

    boolean this_present_creds = true && this.is_set_creds();
    boolean that_present_creds = true && that.is_set_creds();
    if (this_present_creds || that_present_creds) {
      if (!(this_present_creds && that_present_creds))
        return false;
      if (!this.creds.equals(that.creds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_initial_status()) ? 131071 : 524287);
    if (is_set_initial_status())
      hashCode = hashCode * 8191 + initial_status.getValue();

    hashCode = hashCode * 8191 + ((is_set_creds()) ? 131071 : 524287);
    if (is_set_creds())
      hashCode = hashCode * 8191 + creds.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SubmitOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(is_set_initial_status()).compareTo(other.is_set_initial_status());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_initial_status()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.initial_status, other.initial_status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_creds()).compareTo(other.is_set_creds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_creds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creds, other.creds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitOptions(");
    boolean first = true;

    sb.append("initial_status:");
    if (this.initial_status == null) {
      sb.append("null");
    } else {
      sb.append(this.initial_status);
    }
    first = false;
    if (is_set_creds()) {
      if (!first) sb.append(", ");
      sb.append("creds:");
      if (this.creds == null) {
        sb.append("null");
      } else {
        sb.append(this.creds);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_initial_status()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'initial_status' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (creds != null) {
      creds.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SubmitOptionsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SubmitOptionsStandardScheme getScheme() {
      return new SubmitOptionsStandardScheme();
    }
  }

  private static class SubmitOptionsStandardScheme extends org.apache.thrift.scheme.StandardScheme<SubmitOptions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SubmitOptions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INITIAL_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.initial_status = org.apache.storm.generated.TopologyInitialStatus.findByValue(iprot.readI32());
              struct.set_initial_status_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREDS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.creds = new Credentials();
              struct.creds.read(iprot);
              struct.set_creds_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SubmitOptions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.initial_status != null) {
        oprot.writeFieldBegin(INITIAL_STATUS_FIELD_DESC);
        oprot.writeI32(struct.initial_status.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.creds != null) {
        if (struct.is_set_creds()) {
          oprot.writeFieldBegin(CREDS_FIELD_DESC);
          struct.creds.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SubmitOptionsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SubmitOptionsTupleScheme getScheme() {
      return new SubmitOptionsTupleScheme();
    }
  }

  private static class SubmitOptionsTupleScheme extends org.apache.thrift.scheme.TupleScheme<SubmitOptions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SubmitOptions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.initial_status.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.is_set_creds()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.is_set_creds()) {
        struct.creds.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SubmitOptions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.initial_status = org.apache.storm.generated.TopologyInitialStatus.findByValue(iprot.readI32());
      struct.set_initial_status_isSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.creds = new Credentials();
        struct.creds.read(iprot);
        struct.set_creds_isSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

