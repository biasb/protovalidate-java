// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/repeated.proto

package build.buf.validate.conformance.cases;

public interface RepeatedEnumInOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.RepeatedEnumIn)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return A list containing the val.
   */
  java.util.List<build.buf.validate.conformance.cases.AnEnum> getValList();
  /**
   * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The count of val.
   */
  int getValCount();
  /**
   * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The val at the given index.
   */
  build.buf.validate.conformance.cases.AnEnum getVal(int index);
  /**
   * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return A list containing the enum numeric values on the wire for val.
   */
  java.util.List<java.lang.Integer>
  getValValueList();
  /**
   * <code>repeated .buf.validate.conformance.cases.AnEnum val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of val at the given index.
   */
  int getValValue(int index);
}
