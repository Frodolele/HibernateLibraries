import models.Author;
import models.Book;
import models.Reader;
import services.AuthorService;
import services.BookService;
import services.ReaderService;

public class Main {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        BookService bookService = new BookService();
        ReaderService readerService = new ReaderService();
        Author author = new Author();
        author.setFull_name("John Tolkin");
        authorService.saveAuthor(author);
        Book book = new Book();
        book.setTitle("Hobbit");
        book.addAuthor(author);
        bookService.saveBook(book);
        author.addBook(book);
        Book book1 = new Book();
        book1.setTitle("Hobbit 2");
        book1.addAuthor(author);
        Reader reader = new Reader();
        reader.setFullName("Maxim");
        readerService.saveReader(reader);
        reader.addBook(book);
        readerService.updateReader(reader);
        reader.addBook(book1);
        readerService.updateReader(reader);

        System.out.println(authorService.findAllAuthors());
        System.out.println(bookService.findAllBook());
        System.out.println(readerService.findAllReaders());
    }
}
