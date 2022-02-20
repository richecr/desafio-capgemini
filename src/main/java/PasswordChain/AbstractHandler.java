package PasswordChain;

/**
 * Classe abstrata que representa os handler para validações.
 *
 * Todas as classes de validações devem estender dessa.
 */
public abstract class AbstractHandler implements ValidatePasswordChain {

    private ValidatePasswordChain nextValidatePassword;

    @Override
    public ValidatePasswordChain setNext(ValidatePasswordChain validatePasswordChain) {
        this.nextValidatePassword = validatePasswordChain;
        return this.nextValidatePassword;
    }

    @Override
    public int handle(String password) {
        if (this.nextValidatePassword != null) {
            return this.nextValidatePassword.handle(password);
        }

        return 0;
    }
}
