package kata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Day11Test {
    public static Day11 day11 = new Day11();
    public static DataReader reader = new DataReader("C:\\Dev\\JJCodeKata\\src\\test\\resources\\2DarrCase1");

    @Test
    public void hourglassSum() {
        List<String> inputARr = reader.getInputArr();
        List<String> outputArr = reader.getOutputArr();


        List<List<Integer>> arr = new ArrayList<>();
        for(String input : inputARr){
            String[] inputArr = input.split(" ");
            List<Integer> row = new ArrayList<>();
            for(String inputNum : inputArr){
                row.add(Integer.parseInt(inputNum));
            }
            arr.add(row);
        }

        int output = Integer.parseInt(outputArr.get(0));

        int result = day11.hourglassSum(arr);
        assertEquals(output, result);



    }
}