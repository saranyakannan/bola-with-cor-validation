package org.validation.validators;

public class User {
  private String userName;

  private String accountId;

  public User(String userName, String accountId) {

    this.userName = userName;
    this.accountId = accountId;
  }

  public String getAccountId() {
    return accountId;
  }

  public boolean isValid() {
    return this.userName.length() >= 5;
  }
}
