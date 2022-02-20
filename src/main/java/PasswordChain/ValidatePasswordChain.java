package PasswordChain;

/**
 * Interface para ser usado no padrão Chain of Responsibility.
 */
public interface ValidatePasswordChain {

    /**
     * Método para setar a próxima validação a ser feita.
     *
     * @param validatePasswordChain Validação.
     * @return A validação.
     */
    ValidatePasswordChain setNext(ValidatePasswordChain validatePasswordChain);

    /**
     * Método para realizar a validação.
     *
     * @param password Palavra a ser validada.
     * @return Integer
     */
    int handle(String password);
}
