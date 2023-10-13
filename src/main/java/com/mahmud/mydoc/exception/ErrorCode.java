package com.mahmud.mydoc.exception;

public final class ErrorCode {

  private ErrorCode() {}

  public static final int UNKNOWN = -1;
  public static final int ENTITY_NOT_FOUND = 1;
  public static final int ENTITY_NOT_VALID = 2;
  public static final int PATH_NOT_FOUND = 3;
  public static final int ALREADY_EXISTS = 4;
  public static final int UNIQUE_CODE_REQUIRED = 5;
  public static final int PERMISSION_DENIED = 6;

}
