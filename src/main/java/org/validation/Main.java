package org.validation;

import org.validation.validators.Account;
import org.validation.validators.AccountValidator;
import org.validation.validators.User;
import org.validation.validators.UserPartOfAccountValidator;
import org.validation.validators.UserValidator;
import org.validation.validators.ValidatorChain;

public class Main {
  public static void main(String[] args) {

    // First Chain - Passed Validation
    Account account1 = new Account("1234567890");
    User user1 = new User("john_doe", "1234567890");
    ValidatorChain validatorChain1 = new ValidatorChain();
    validatorChain1.addValidator(new AccountValidator());
    validatorChain1.addValidator(new UserValidator());
    validatorChain1.addValidator(new UserPartOfAccountValidator());
    String result1 = validatorChain1.validate(account1, user1);
    System.out.println("Validation Result 1: " + result1);

    // Second Chain - Failed in UserValidator
    Account account2 = new Account("1234567890");
    User user2 = new User("", "1234");
    ValidatorChain validatorChain2 = new ValidatorChain();
    validatorChain2.addValidator(new AccountValidator());
    validatorChain2.addValidator(new UserValidator());
    validatorChain2.addValidator(new UserPartOfAccountValidator());
    String result2 = validatorChain2.validate(account2, user2);
    System.out.println("Validation Result 2: " + result2);

    // Third Chain - Failed in UserPartOfAccountValidator
    Account account3 = new Account("1234567890");
    User user3 = new User("john_doe", "1234");
    ValidatorChain validatorChain3 = new ValidatorChain();
    validatorChain3.addValidator(new AccountValidator());
    validatorChain3.addValidator(new UserValidator());
    validatorChain3.addValidator(new UserPartOfAccountValidator());
    String result3 = validatorChain3.validate(account3, user3);
    System.out.println("Validation Result 3: " + result3);
  }
}