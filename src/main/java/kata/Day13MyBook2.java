package kata;

public class Day13MyBook2 extends Day13Book{
    private int price;

    public Day13MyBook2(String title, String author, int price){
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println(makeInfo());
    }

    @Override
    String makeInfo() {
        return "Price: " + price  + "Title: " + title + "\nAuthor: " + author ;
    }
}
