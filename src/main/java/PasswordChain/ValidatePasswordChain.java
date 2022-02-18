package PasswordChain;

public interface ValidatePasswordChain {

    ValidatePasswordChain setNext(ValidatePasswordChain validatePasswordChain);
    int handle(String password);
}
