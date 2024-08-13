import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class MonkeyTroubleTest {

    @Test
    public void testBothMonkeysSmiling() {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        boolean result = monkeyTrouble.monkeyTrouble(true, true);
        assertTrue(result, "Both monkeys smiling should return true (monkey trouble).");
    }

    @Test
    public void testNeitherMonkeySmiling() {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        boolean result = monkeyTrouble.monkeyTrouble(false, false);
        assertTrue(result, "Neither monkey smiling should return true (monkey trouble).");
    }

    @Test
    public void testOneMonkeySmiling() {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        boolean result1 = monkeyTrouble.monkeyTrouble(true, false);
        boolean result2 = monkeyTrouble.monkeyTrouble(false, true);
        assertFalse(result1, "One monkey smiling and the other not should return false (no monkey trouble).");
        assertFalse(result2, "One monkey smiling and the other not should return false (no monkey trouble).");
    }
}

