package com.mahmud.mydoc.exception;

public class PathNotFoundException extends ApplicationException {

  public PathNotFoundException() {
    super(ErrorCode.PATH_NOT_FOUND, "exception.path.not.found");
  }
}
