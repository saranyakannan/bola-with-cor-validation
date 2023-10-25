package org.validation.validators;

public class ValidatorChain {

  private Validator firstValidator;

  public void addValidator(Validator validator)
  {
    if (firstValidator == null) { // If there is no validator in the chain, then add the first one
      firstValidator = validator;
    } else {
      Validator currentValidator = firstValidator;
      while (currentValidator.getNext() != null) {
        currentValidator = currentValidator.getNext();
      }
      currentValidator.setNext(validator);
    }
  }

  public String validate(Account account, User user)
  {
    while (firstValidator != null) {
       boolean isValid = firstValidator.validate(account, user);

       if(!isValid)
         return "Validation failed at "+firstValidator.getClass().getSimpleName();
       firstValidator = firstValidator.getNext();

    }
    return "All validations passed";
  }



}


