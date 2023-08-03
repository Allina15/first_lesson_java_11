import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();
        book5.setName("Becoming");
        book5.setAutor("Mishail Obama");
        book5.setQuantity(8);
        book4.setName("BigMan");
        book4.setAutor("Deputat");
        book4.setQuantity(5);
        book3.setName("Uzak jol");
        book3.setAutor("M.Elebaev");
        book3.setQuantity(35);
        book1.setName("Jamila");
        book1.setAutor("Ch.Aitmatov");
        book1.setQuantity(30);
        book2.setName("Toolor kulaganda");
        book2.setAutor("Ch.Aitmatov");
        book2.setQuantity(28);
        Book[]books={book1,book2,book3,book4,};

        Library library1 = new Library();
        library1.setName("A.Osmonov");
        library1.setAddress("Pr.Chui 123");
        library1.setBooks(books);
        System.out.println(library1.addABookToTheLibrary(book5));
        System.out.println(Arrays.toString(library1.removeBookFromLibrary(book3)));
        System.out.println(library1.updateBookByName("Jamila",12));
        System.out.println(Arrays.toString(library1.getAllBookByAuthor("Ch.Aitmatov")));
        }
}