package dao;

import models.Reader;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class ReaderDaoImpl implements ReaderDao {
    @Override
    public Reader findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Reader.class, id);
    }

    @Override
    public void save(Reader reader) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(reader);
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    @Override
    public void update(Reader reader) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(reader);
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Reader reader) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(reader);
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Reader> findAll() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("FROM Reader").list();
    }
}
