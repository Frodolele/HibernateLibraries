package services;

import dao.AuthorDaoImpl;
import dao.ReaderDaoImpl;

import models.Reader;

import java.util.List;

public class ReaderService {
    private ReaderDaoImpl readerDao = new ReaderDaoImpl();

    public Reader findReader(int id){
        return readerDao.findById(id);
    }
    public void saveReader(Reader reader){
        readerDao.save(reader);
    }
    public void updateReader(Reader reader){
        readerDao.update(reader);
    }
    public void deleteReader(Reader reader){
        readerDao.delete(reader);
    }
    public List<Reader> findAllReaders(){
        return readerDao.findAll();
    }
}
