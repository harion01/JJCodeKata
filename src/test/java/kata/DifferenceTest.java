package kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class DifferenceTest {


    @Test
    public void computeDifference() {
        Difference diff = new Difference(new int[]{1, 2, 5});
        diff.computeDifference();
        assertEquals(4, diff.maximumDifference);
    }
}