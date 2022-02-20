import PasswordChain.*;

import java.util.Scanner;

/**
 * Classe que possui a solução da Questão 1
 */
public class ChallengePassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(verifyPassword(word));
    }

    /**
     * Método que irá verificar se a palavra obdece as regras impostas.
     * Utilizei o padrão de projeto Chain of Responsibility.
     *
     * Onde é setado todas as validações que a palavra será submetida.
     *
     * @param word Palavra a ser verificada.
     * @return caracteres a serem adicionados.
     */
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
