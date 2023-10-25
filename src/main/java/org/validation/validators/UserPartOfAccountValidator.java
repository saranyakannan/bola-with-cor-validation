package org.validation.validators;

public class UserPartOfAccountValidator implements Validator {

  public Validator getNext() {
    return next;
  }

  private Validator next;

  public void setNext(Validator validator) {
    this.next = validator;
  }

  public boolean validate(Account account, User user) {
    if (!user.getAccountId().equalsIgnoreCase(account.getAccountNumber())) {
      return false;
    }
    return true;
  }
}
