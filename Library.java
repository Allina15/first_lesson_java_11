import java.lang.reflect.Array;
import java.util.Arrays;

public class Library {
    private String name;
    private String address;
    private Book[]books;

    public Library(){
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Book[] getBooks() {
        return books;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }
    public String addABookToTheLibrary(Book book){
        for (Book b:books) {
           if(b.getName().equalsIgnoreCase(book.getName())) {
               return "Takaya kniga uje est";
           }
        }
        Book []books1 = new Book[books.length+1];
        for (int i = 0; i < books.length; i++) {
            books1[i]=books[i];
        }
        books1[books.length]=book;
        books=Arrays.copyOf(books1,books1.length);
        return "kniga dobavlena";
    }
    public Book[] removeBookFromLibrary(Book bookName){
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i]==bookName){
                index=i;
                break;
            }
        }
        if(index==0){
        return books;
    }
        Book[] newArray = new Book[books.length - 1];
        if (index > 0) {
            System.arraycopy(books, 0, newArray, 0, index);
        }
        if (index < books.length - 1) {
            System.arraycopy(books, index + 1, newArray, index, books.length - index - 1);
        }

        return newArray;
    }
public Book updateBookByName(String bookName, int newQuantity){
    for (int i = 0; i < books.length ; i++) {
        if(books[i].getName().equalsIgnoreCase(bookName)){
            books[i].setQuantity(newQuantity);
            return books[i];
        }
    }
    return null;
    }
    public Book [] getAllBookByAuthor(String author){
        Book [] sameAuthors = new Book[0];
        for (int i = 0; i < books.length; i++) {
            if(books[i].getAuthor().equalsIgnoreCase(author)){
                sameAuthors = Arrays.copyOf(sameAuthors,sameAuthors.length+1);
                sameAuthors[sameAuthors.length-1]=books[i];
            }
        }
        return sameAuthors;
    }
    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
