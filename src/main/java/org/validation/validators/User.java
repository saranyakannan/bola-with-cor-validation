package org.validation.validators;

public class User{
  private String userName;

  private String accountId;

  public User(String userName, String accountId) {

    this.userName = userName;
    this.accountId = accountId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
  public boolean isValid() {
    return this.userName.length() >= 5;
  }
}
