package kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class Calculator19Test {

    @Test
    public void divisorSum() {
        Day19 p = new Day19();
        int totalSum = p.divSumAll(10);
        int oddSum = p.divSumOdd(10);
        int evenSum = p.divSumEven(10);

        assertEquals(18, totalSum);
        assertEquals(6, oddSum);
        assertEquals(12, evenSum);

    }
}