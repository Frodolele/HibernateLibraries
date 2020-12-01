import models.Author;
import models.Book;
import services.AuthorService;

public class Main {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        Author author = new Author();
        author.setFull_name("John Tolkin");
        authorService.saveAuthor(author);
        Book book = new Book();
        book.addAuthor(author);
        author.addBook(book);
    }
}
