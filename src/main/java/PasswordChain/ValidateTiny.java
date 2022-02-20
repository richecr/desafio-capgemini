package PasswordChain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe que é responsável por validar a palavra de ter pelo menos 1 caractere minúsculo.
 */
public class ValidateTiny extends AbstractHandler {

    @Override
    public int handle(String password) {
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher m = pattern.matcher(password);
        if (m.find()) {
            return super.handle(password);
        }
        return 1 + super.handle(password);
    }
}
