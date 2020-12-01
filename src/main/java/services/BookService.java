package services;

import dao.BookDaoImpl;
import models.Book;

import java.util.List;

public class BookService {
    private BookDaoImpl bookDaoImpl = new BookDaoImpl();

    public Book findBook(int id) {
        return bookDaoImpl.findById(id);
    }

    public void saveBook(Book book){
        bookDaoImpl.save(book);
    }

    public void updateBook(Book book){
        bookDaoImpl.update(book);
    }

    public void deleteBook(Book book){
        bookDaoImpl.delete(book);
    }

    public List<Book> findAllBook(){
        return bookDaoImpl.findAll();
    }
}
