package dao;

import models.Author;
import models.Book;

import java.util.List;

public interface AuthorDao {
    public Author findById(int id);
    public void save(Author author);
    public void update(Author author);
    public void delete(Author author);
    public List<Author> findAll();
}
