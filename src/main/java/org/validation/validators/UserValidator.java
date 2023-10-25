package org.validation.validators;

public class UserValidator implements Validator {
  private Validator next;

  @Override
  public Validator getNext() {
    return next;
  }

  public void setNext(Validator validator) {
    this.next = validator;
  }

  public boolean validate(Account account, User user) {
    if (!user.isValid()) {
      return false;
    }
    return true;
  }

}
