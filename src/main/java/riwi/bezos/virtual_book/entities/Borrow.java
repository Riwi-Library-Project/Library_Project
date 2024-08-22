package riwi.bezos.virtual_book.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import riwi.bezos.virtual_book.enums.BorrowState;

import java.sql.Date;

@Entity
@Table(name = "Borrow")
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "bookId", nullable = false)
    private Book book;

    @Column(nullable = false)
    private Date initialDate;

    @Column(nullable = false)
    private Date devolutionDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BorrowState state;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createDate;

    @LastModifiedDate
    @Column(nullable = false)
    private Date updateDate;

    public Borrow() {
    }

    public Borrow(int id, User user, Book book, Date initialDate, Date devolutionDate, BorrowState state, Date createDate, Date updateDate) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.initialDate = initialDate;
        this.devolutionDate = devolutionDate;
        this.state = state;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public BorrowState getState() {
        return state;
    }

    public void setState(BorrowState state) {
        this.state = state;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
