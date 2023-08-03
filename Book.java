public class Book {
    private String name;
    private int quantity;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAutor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book " +
                "name=" + name +
                ", quantity=" + quantity +
                ", author=" + author;
    }
}
