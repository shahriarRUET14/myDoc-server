package com.mahmud.mydoc.exception;

public class EntityNotFoundException extends ApplicationException {

  public EntityNotFoundException() {
    super(ErrorCode.ENTITY_NOT_FOUND, "exception.entity.not.found");
  }
}
