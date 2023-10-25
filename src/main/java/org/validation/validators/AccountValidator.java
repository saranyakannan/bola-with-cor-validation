package org.validation.validators;

public class AccountValidator implements Validator{
  public Validator getNext() {
    return next;
  }

  private Validator next;

  public void setNext(Validator validator) {
    this.next = validator;
  }

  public boolean validate(Account account, User user) {
    if (!account.isValid()) {
      return false;
    }
    return true;
  }
}
