import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ChallengeLadderAsterisksTest {

    @Test
    public void testLadderAsterisksN0() {
        int n = 0;
        Assertions.assertEquals("", ChallengeLadderAsterisks.getLadderAsterisks(n));
    }

    @Test
    public void testLadderAsterisksN1() {
        int n = 1;
        Assertions.assertEquals("*\n", ChallengeLadderAsterisks.getLadderAsterisks(n));
    }

    @Test
    public void testLadderAsterisksN6() {
        int n = 6;
        Assertions.assertEquals("     *\n    **\n   ***\n  ****\n *****\n******\n", ChallengeLadderAsterisks.getLadderAsterisks(n));
    }
}
