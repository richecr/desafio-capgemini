import java.util.*;

public class ChallengeAnagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(countAnagrams(word));
    }

    public static long countAnagrams(String word) {
        Map<Integer, List<String>> map = getAllSequences(word);
        List<List<String>> sequences = new ArrayList<>(map.values());
        return sequences
                .subList(0, word.length())
                .stream()
                .map(ChallengeAnagram::searchAnagrams)
                .reduce(0, Integer::sum);
    }

    private static Map<Integer, List<String>> getAllSequences(String word) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String subString = word.substring(i, j)
                        .chars()
                        .sorted()
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString();
                List<String> sequence = map.getOrDefault(subString.length(), new ArrayList<>());
                sequence.add(subString);
                map.put(subString.length(), sequence);
            }
        }
        return map;
    }

    private static int searchAnagrams(List<String> sequences) {
        int result = 0;
        for (int i = 0; i < sequences.size() - 1; i++) {
            int finalI = i;
            result += sequences
                    .subList(i + 1, sequences.size())
                    .stream()
                    .filter(sequence -> sequences.get(finalI).equals(sequence))
                    .count();
        }
        return result;
    }
}
