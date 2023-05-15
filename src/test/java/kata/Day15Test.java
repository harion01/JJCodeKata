package kata;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Day15Test {

    public static DataReader reader = new DataReader("C:\\Dev\\JJCodeKata\\src\\test\\resources\\Day15Test");


    @Test
    public void inseday15rt() {
        Day15 day15 = new Day15();
        List<String> input = reader.getInputArr();
        List<String> output = reader.getOutputArr();
        Node head = null;
        for(int idx = 1 ; idx < input.size() ; idx++){
            int data = Integer.parseInt(input.get(idx));
            if(head == null){
                head = new Node(data);
            }else{
                day15.insert(head, data);
            }
        }

        for(int idx = 0 ; idx < output.size() ; idx++){
            int data = Integer.parseInt(output.get(idx));
            assertEquals(data, head.data);
            head = head.next;
        }




    }
}