import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class SleepInTest {

    private final SleepIn sleepIn = new SleepIn();

    @Test
    public void testWeekdayFalseVacationFalse() {
        // Test when it's a weekday and not a vacation
        assertFalse(sleepIn.sleepIn(true, false), "Expected false when it's a weekday and not a vacation.");
    }

    @Test
    public void testWeekdayFalseVacationTrue() {
        // Test when it's not a weekday but it is a vacation
        assertTrue(sleepIn.sleepIn(false, true), "Expected true when it's not a weekday and it's a vacation.");
    }

    @Test
    public void testWeekdayTrueVacationFalse() {
        // Test when it's a weekday and also not a vacation
        assertFalse(sleepIn.sleepIn(true, false), "Expected false when it's a weekday and not a vacation.");
    }

    @Test
    public void testWeekdayTrueVacationTrue() {
        // Test when it's a weekday but it is a vacation
        assertTrue(sleepIn.sleepIn(true, true), "Expected true when it's a weekday but it's a vacation.");
    }

    @Test
    public void testWeekdayFalseVacationAny() {
        // Test when it's not a weekday (should sleep in regardless of vacation status)
        assertTrue(sleepIn.sleepIn(false, false), "Expected true when it's not a weekday, even if not a vacation.");
        assertTrue(sleepIn.sleepIn(false, true), "Expected true when it's not a weekday, regardless of vacation status.");
    }

    @Test
    public void testWeekdayAnyVacationTrue() {
        // Test when it's a vacation (should sleep in regardless of whether it's a weekday)
        assertTrue(sleepIn.sleepIn(true, true), "Expected true when it's a vacation, regardless of weekday status.");
        assertTrue(sleepIn.sleepIn(false, true), "Expected true when it's a vacation, regardless of weekday status.");
    }
}

