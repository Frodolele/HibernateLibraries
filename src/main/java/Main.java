import models.Author;
import models.Book;
import services.AuthorService;
import services.BookService;

public class Main {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        BookService bookService = new BookService();
        Author author = new Author();
        author.setFull_name("John Tolkin");
        authorService.saveAuthor(author);
        Book book = new Book();
        book.setTitle("Hobbit");
        book.addAuthor(author);
        bookService.saveBook(book);
        author.addBook(book);
        System.out.println(authorService.findAllAuthors());
        System.out.println(bookService.findAllBook());
    }
}
