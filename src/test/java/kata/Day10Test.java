package kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day10Test {

    @Test
    public void binary() {
        int result = Day10.binary(5);
        assertEquals(1, result);

        result = Day10.binary(13);
        assertEquals(2, result);

        //case 3 : test given integer 123
        result = Day10.binary(123);
        assertEquals(4, result);
    }
}