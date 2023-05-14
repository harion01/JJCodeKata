package kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day13MyBook2Test {


    @Test
    public void makeInfo() {
        Day13Book book = new Day13MyBook("The Alchemist", "Paulo Coelho", 248);
        assertEquals("Title: The Alchemist\nAuthor: Paulo Coelho\nPrice: 248", book.makeInfo());

        book = new Day13MyBook2("The Alchemist", "Paulo Coelho", 248);
        assertEquals("Price: 248Title: The Alchemist\nAuthor: Paulo Coelho", book.makeInfo());
    }
}