package kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day9Test {
    public static Day9 day9 = new Day9();

    @Test
    public void factorial() {
        int result = day9.factorial(3);
        assertEquals(6, result);
    }

    @Test
    public void dynamicFactorial() {
        int result = day9.dynamicFactorial(3);
        assertEquals(6, result);
    }
}