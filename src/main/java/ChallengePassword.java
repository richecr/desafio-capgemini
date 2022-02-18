import PasswordChain.*;

import java.util.Scanner;

public class ChallengePassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(verifyPassword(word));
    }

    public static int verifyPassword(String word) {
        ValidateTiny validateTiny = new ValidateTiny();
        ValidateDigit validateDigit = new ValidateDigit();
        ValidateUppercase validateUppercase = new ValidateUppercase();
        ValidateSpecialCharacters validateSpecialCharacters = new ValidateSpecialCharacters();

        validateTiny.setNext(validateDigit).setNext(validateUppercase).setNext(validateSpecialCharacters);
        int missingCharacters = validateTiny.handle(word);

        int minSize = 6;
        if (missingCharacters + word.length() >= minSize) {
            return missingCharacters;
        }

        return (minSize - missingCharacters - word.length()) + missingCharacters;
    }
}
