public class Book extends BaseEntity{
    private String title;
    private String author;
    private String publisher;
    private Double price;

    public Book(Integer bookId, String title, String author, String publisher, Double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public Double getPrice() {
        return price;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book ID: " + getId() +
                ", Title: " + title +
                ", Author: " + author +
                ", Publisher: " + publisher +
                ", Price: $" + price;
    }
}
