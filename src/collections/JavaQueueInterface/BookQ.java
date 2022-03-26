package collections.JavaQueueInterface;

public class BookQ implements Comparable<BookQ>{
    int id;
    String name,author,publisher;
    int quantity;
    public BookQ(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public int compareTo(BookQ b) {
        return Integer.compare(id, b.id);
    }
}
