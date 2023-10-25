package org.validation.validators;

public interface Validator {

  Validator getNext();

  void setNext(Validator validator);

  boolean validate(Account account, User user);
}