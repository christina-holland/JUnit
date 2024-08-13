import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AbsoluteDifferenceTest {

    private final AbsoluteDifference absoluteDifference = new AbsoluteDifference();

    @Test
    public void testNumberLessThan21() {
        // Test cases where n is less than 21
        assertEquals(10, absoluteDifference.diff21(11), "Expected difference when number is less than 21.");
        assertEquals(5, absoluteDifference.diff21(16), "Expected difference when number is less than 21.");
        assertEquals(1, absoluteDifference.diff21(20), "Expected difference when number is less than 21.");
    }

    @Test
    public void testNumberEqualTo21() {
        // Test case where n is exactly 21
        assertEquals(0, absoluteDifference.diff21(21), "Expected zero difference when number is exactly 21.");
    }

    @Test
    public void testNumberGreaterThan21() {
        // Test cases where n is greater than 21
        assertEquals(8, absoluteDifference.diff21(25), "Expected double difference when number is greater than 21.");
        assertEquals(18, absoluteDifference.diff21(30), "Expected double difference when number is greater than 21.");
        assertEquals(40, absoluteDifference.diff21(41), "Expected double difference when number is greater than 21.");
    }
}

