package PasswordChain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSpecialCharacters extends AbstractHandler {

    @Override
    public int handle(String password) {
        Pattern pattern = Pattern.compile("[!@#$%^&*()-+]+");
        Matcher m = pattern.matcher(password);
        if (m.find()) {
            return super.handle(password);
        }
        return 1 + super.handle(password);
    }
}
