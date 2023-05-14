package kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day12StudentTest {

    public static DataReader reader = new DataReader("C:\\Dev\\JJCodeKata\\src\\test\\resources\\Day12Test");


    @Test
    public void calculate() {
        Day12Student student = new Day12Student(reader.getInputArr().get(0), Integer.parseInt(reader.getInputArr().get(1)), reader.getInputArr().get(2));
        student.calculate();
        assertEquals(reader.getOutputArr().get(0), student.makeName());
        assertEquals(reader.getOutputArr().get(1), student.makeID());
        assertEquals(reader.getOutputArr().get(2), student.makeScore());

    }

}