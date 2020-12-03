package services;

import dao.AuthorDaoImpl;
import dao.ReaderDaoImpl;

import models.Reader;

import java.util.List;

public class ReaderService {
    private ReaderDaoImpl readerDao = new ReaderDaoImpl();

    public Reader findAuthor(int id){
        return readerDao.findById(id);
    }
    public void saveAuthor(Reader reader){
        readerDao.save(reader);
    }
    public void updateAuthor(Reader reader){
        readerDao.update(reader);
    }
    public void deleteAuthor(Reader reader){
        readerDao.delete(reader);
    }
    public List<Reader> findAllAuthors(){
        return readerDao.findAll();
    }
}
