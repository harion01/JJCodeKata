package kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day18Test {

    @Test
    public void main() {
        Day18 p = new Day18();

        //test case for word racecar
        String input = "racecar";
        char[] s = input.toCharArray();
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        boolean isPalindrome = true;
        // pop and dequeue the chars at the head of both data structures and compare them:
        for (int i = 0; i < s.length ; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        assertTrue(isPalindrome);


    }
}