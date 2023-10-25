package org.validation.validators;


public class Account {

  private String accountNumber;

  public Account(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public boolean isValid() {
    return this.accountNumber.length() >= 10;
  }

}
