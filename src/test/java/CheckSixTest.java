import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class CheckSixTest {

    private final CheckSix checkSix = new CheckSix();

    @Test
    public void testFirstElementIsSix() {
        // Test where 6 is the first element in the array
        int[] nums = {6, 2, 3};
        assertTrue(checkSix.firstOrLastIsSix(nums), "Expected true when 6 is the first element.");
    }

    @Test
    public void testLastElementIsSix() {
        // Test where 6 is the last element in the array
        int[] nums = {1, 2, 6};
        assertTrue(checkSix.firstOrLastIsSix(nums), "Expected true when 6 is the last element.");
    }

    @Test
    public void testFirstAndLastElementIsSix() {
        // Test where 6 is both the first and last element in the array
        int[] nums = {6, 1, 6};
        assertTrue(checkSix.firstOrLastIsSix(nums), "Expected true when 6 is both the first and last element.");
    }

    @Test
    public void testNeitherElementIsSix() {
        // Test where 6 is neither the first nor the last element in the array
        int[] nums = {1, 2, 3};
        assertFalse(checkSix.firstOrLastIsSix(nums), "Expected false when 6 is neither the first nor the last element.");
    }

    @Test
    public void testSingleElementArrayIsSix() {
        // Test where the array has a single element and it is 6
        int[] nums = {6};
        assertTrue(checkSix.firstOrLastIsSix(nums), "Expected true when the single element is 6.");
    }

    @Test
    public void testSingleElementArrayIsNotSix() {
        // Test where the array has a single element and it is not 6
        int[] nums = {1};
        assertFalse(checkSix.firstOrLastIsSix(nums), "Expected false when the single element is not 6.");
    }

    @Test
    public void testEmptyArray() {
        // Test where the array is empty (edge case)
        int[] nums = {};
        assertFalse(checkSix.firstOrLastIsSix(nums), "Expected false for an empty array.");
    }
}
