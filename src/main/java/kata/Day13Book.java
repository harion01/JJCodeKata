package kata;

public abstract class Day13Book {
    String title;
    String author;

    Day13Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    abstract void display();
    abstract String makeInfo();
}
