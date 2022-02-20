import java.util.Scanner;

/**
 * Classe que possui a solução da Questão 1
 */
public class ChallengeLadderAsterisks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int input = Integer.parseInt(scanner.nextLine());
            System.out.println(getLadderAsterisks(input));
        } catch (NumberFormatException e){
            System.out.println("Entrada inválida!");
        }
    }

    public static String getLadderAsterisks(int length){
        String result = "";
        for (int i = 1; i <= length; i++) {
            result = String.format("%s%s", result, concatString(length - i, " "));
            result = String.format("%s%s\n", result, concatString(i, "*"));
        }
        return result;
    }

    public static String concatString(int length, String string){
        String result = "";
        for (int i = 0; i < length; i++) {
            result = String.format("%s%s", result, string);
        }

        return result;
    }

}
