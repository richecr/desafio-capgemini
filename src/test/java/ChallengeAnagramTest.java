import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeAnagramTest {

    @Test
    public void testCountAnagramsWord3Length() {
        String word = "ovo";
        Assertions.assertEquals(2, ChallengeAnagram.countAnagrams(word));
    }

    @Test
    public void testCountAnagramsWordEmpty() {
        String word = "";
        Assertions.assertEquals(0, ChallengeAnagram.countAnagrams(word));
    }

    @Test
    public void testCountAnagramsWord10Length() {
        String word = "ifailuhkqq";
        Assertions.assertEquals(3, ChallengeAnagram.countAnagrams(word));
    }
}
