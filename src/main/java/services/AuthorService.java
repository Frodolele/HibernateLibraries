package services;

import dao.AuthorDaoImpl;
import models.Author;

import java.util.List;

public class AuthorService {
    private AuthorDaoImpl authorDao = new AuthorDaoImpl();

    public Author findAuthor(int id){
        return authorDao.findById(id);
    }
    public void saveAuthor(Author author){
        authorDao.save(author);
    }
    public void updateAuthor(Author author){
        authorDao.update(author);
    }
    public void deleteAuthor(Author author){
        authorDao.delete(author);
    }
    public List<Author> findAllAuthors(){
        return authorDao.findAll();
    }
}
