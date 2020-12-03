package dao;

import models.Reader;

import java.util.List;

public interface ReaderDao {
    public Reader findById(int id);
    public void save(Reader reader);
    public void update(Reader reader);
    public void delete(Reader reader);
    public List<Reader> findAll();
}
