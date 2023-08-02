// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/harness/harness.proto

package build.buf.validate.conformance.harness;

public interface TestResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.harness.TestResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * success is true if the test succeeded.
   * </pre>
   *
   * <code>bool success = 1 [json_name = "success"];</code>
   * @return Whether the success field is set.
   */
  boolean hasSuccess();
  /**
   * <pre>
   * success is true if the test succeeded.
   * </pre>
   *
   * <code>bool success = 1 [json_name = "success"];</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <pre>
   * validation_error is the error if the test failed due to validation errors.
   * </pre>
   *
   * <code>.buf.validate.Violations validation_error = 2 [json_name = "validationError"];</code>
   * @return Whether the validationError field is set.
   */
  boolean hasValidationError();
  /**
   * <pre>
   * validation_error is the error if the test failed due to validation errors.
   * </pre>
   *
   * <code>.buf.validate.Violations validation_error = 2 [json_name = "validationError"];</code>
   * @return The validationError.
   */
  build.buf.validate.Violations getValidationError();
  /**
   * <pre>
   * validation_error is the error if the test failed due to validation errors.
   * </pre>
   *
   * <code>.buf.validate.Violations validation_error = 2 [json_name = "validationError"];</code>
   */
  build.buf.validate.ViolationsOrBuilder getValidationErrorOrBuilder();

  /**
   * <pre>
   * compilation_error is the error if the test failed due to compilation errors.
   * </pre>
   *
   * <code>string compilation_error = 3 [json_name = "compilationError"];</code>
   * @return Whether the compilationError field is set.
   */
  boolean hasCompilationError();
  /**
   * <pre>
   * compilation_error is the error if the test failed due to compilation errors.
   * </pre>
   *
   * <code>string compilation_error = 3 [json_name = "compilationError"];</code>
   * @return The compilationError.
   */
  java.lang.String getCompilationError();
  /**
   * <pre>
   * compilation_error is the error if the test failed due to compilation errors.
   * </pre>
   *
   * <code>string compilation_error = 3 [json_name = "compilationError"];</code>
   * @return The bytes for compilationError.
   */
  com.google.protobuf.ByteString
      getCompilationErrorBytes();

  /**
   * <pre>
   * runtime_error is the error if the test failed due to runtime errors.
   * </pre>
   *
   * <code>string runtime_error = 4 [json_name = "runtimeError"];</code>
   * @return Whether the runtimeError field is set.
   */
  boolean hasRuntimeError();
  /**
   * <pre>
   * runtime_error is the error if the test failed due to runtime errors.
   * </pre>
   *
   * <code>string runtime_error = 4 [json_name = "runtimeError"];</code>
   * @return The runtimeError.
   */
  java.lang.String getRuntimeError();
  /**
   * <pre>
   * runtime_error is the error if the test failed due to runtime errors.
   * </pre>
   *
   * <code>string runtime_error = 4 [json_name = "runtimeError"];</code>
   * @return The bytes for runtimeError.
   */
  com.google.protobuf.ByteString
      getRuntimeErrorBytes();

  /**
   * <pre>
   * unexpected_error is any other error that may have occurred.
   * </pre>
   *
   * <code>string unexpected_error = 5 [json_name = "unexpectedError"];</code>
   * @return Whether the unexpectedError field is set.
   */
  boolean hasUnexpectedError();
  /**
   * <pre>
   * unexpected_error is any other error that may have occurred.
   * </pre>
   *
   * <code>string unexpected_error = 5 [json_name = "unexpectedError"];</code>
   * @return The unexpectedError.
   */
  java.lang.String getUnexpectedError();
  /**
   * <pre>
   * unexpected_error is any other error that may have occurred.
   * </pre>
   *
   * <code>string unexpected_error = 5 [json_name = "unexpectedError"];</code>
   * @return The bytes for unexpectedError.
   */
  com.google.protobuf.ByteString
      getUnexpectedErrorBytes();

  build.buf.validate.conformance.harness.TestResult.ResultCase getResultCase();
}
