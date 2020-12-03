package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "readers")
public class Reader {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="full_name")
    private String fullName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "books_readers",
            joinColumns = @JoinColumn(name="reader_id"),
            inverseJoinColumns = @JoinColumn(name="book_id")
    )
    private List<Book> books = new ArrayList<>(); // better initialize in constructor

    public int getId() {
        return id;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", full_name='" + fullName + '\'' +
                ", books=" + books +
                '}';
    }
}
