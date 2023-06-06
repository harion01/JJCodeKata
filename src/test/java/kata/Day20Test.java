package kata;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.*;

public class Day20Test {

    @Test
    public void doBubbleSort() {
        Day20 p = new Day20();
        int[] input = {3, 2, 1};
        //convert input to array list
        List<Integer> a = Stream.of(input)
                .map(Integer::parseInt)
                .collect(toList());


        int swapCount = p.doBubbleSort(a);
        assertArrayEquals(3, swapCount);



    }
}