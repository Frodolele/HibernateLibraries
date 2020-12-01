package dao;

import models.Book;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class BookDaoImpl implements BookDao {
    @Override
    public Book findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Book.class, id);
    }

    @Override
    public void save(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.save(book);
            session.getTransaction().commit();
        } finally{
            session.close();
        }
    }

    @Override
    public void update(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.update(book);
            session.getTransaction().commit();
        } finally{
            session.close();
        }
    }

    @Override
    public void delete(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.delete(book);
            session.getTransaction().commit();
        } finally{
            session.close();
        }
    }

    @Override
    public List<Book> findAll() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Book book").list();
    }
}
