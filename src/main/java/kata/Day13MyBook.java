package kata;

public class Day13MyBook extends Day13Book {
    private int price;

    public Day13MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
//        System.out.println("Title: " + title);
//        System.out.println("Author: " + author);
//        System.out.println("Price: " + Integer.toString(price));
        System.out.println(makeInfo());
    }

    @Override
    String makeInfo() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: " + price;
    }
}
