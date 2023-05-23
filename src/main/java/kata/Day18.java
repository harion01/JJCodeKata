package kata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day18 {

    public List<Character> data = new ArrayList<Character>();
    int stackIndex = 0;
    int queueIndex = 0;
    int queuePos = 0;

    public void pushCharacter(char ch) {
        data.add(stackIndex, ch);
        stackIndex++;
    }

    public Character popCharacter() {
        if (stackIndex == 0) {
            System.out.println("stackIndex is 0");
            return null;
        }
        stackIndex--;
        return data.get(stackIndex);
    }

    public void enqueueCharacter(char ch) {
        data.add(queuePos, ch);
        queuePos++;
    }

    public Character dequeueCharacter() {
        if (queueIndex == queuePos) {
            System.out.println("queueIndex is queuePos");
            return null;
        }
        queueIndex++;
        return data.get(queueIndex - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}

