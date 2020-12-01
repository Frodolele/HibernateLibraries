package dao;

import models.Author;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class AuthorDaoImpl implements AuthorDao {
    public Author findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Author.class, id);
    }

    public void save(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(author);
            session.getTransaction().commit();
        } finally {
            session.close();
        }

    }

    public void update(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(author);
            session.getTransaction().commit();

        } finally {
            session.close();
        }

    }

    public void delete(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(author);
            session.getTransaction().commit();

        } finally {
            session.close();
        }

    }

    public List<Author> findAll() {
        return null;
    }
}
