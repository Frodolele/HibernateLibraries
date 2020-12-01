package dao;


import models.Book;

import java.util.List;

public interface BookDao {
    public Book findById(int id);
    public void save(Book book);
    public void update(Book book);
    public void delete(Book book);
    public List<Book> findAll();
}
