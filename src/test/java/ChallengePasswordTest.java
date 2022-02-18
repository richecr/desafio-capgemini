import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengePasswordTest {

    @Test
    public void testPasswordTestWordYa3() {
        String word = "Ya3";
        int answer = 3;
        Assertions.assertEquals(answer, ChallengePassword.verifyPassword(word));
    }

    @Test
    public void testPasswordTestWordYa3Hashtag() {
        String word = "Ya3#";
        int answer = 2;
        Assertions.assertEquals(answer, ChallengePassword.verifyPassword(word));
    }

    @Test
    public void testPasswordTestWord111111() {
        String word = "aaaaaa";
        int answer = 3;
        Assertions.assertEquals(answer, ChallengePassword.verifyPassword(word));
    }

    @Test
    public void testPasswordTestWordEDFf() {
        String word = "EDFf";
        int answer = 2;
        Assertions.assertEquals(answer, ChallengePassword.verifyPassword(word));
    }
}
