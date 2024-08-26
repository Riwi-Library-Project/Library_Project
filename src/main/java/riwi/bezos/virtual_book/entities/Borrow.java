package riwi.bezos.virtual_book.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import riwi.bezos.virtual_book.enums.BorrowState;
import java.time.LocalDateTime;

@Entity
@Table(name = "Borrow")
@EntityListeners(AuditingEntityListener.class)
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
    private LocalDateTime initialDate;

    @Column(nullable = false)
    private LocalDateTime devolutionDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BorrowState state;

    @CreatedDate
    @Column(nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createDate;

    @LastModifiedDate
    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime updateDate;

    public Borrow() {
    }

    public Borrow(int id, User user, Book book, LocalDateTime initialDate, LocalDateTime devolutionDate, BorrowState state, LocalDateTime createDate, LocalDateTime updateDate) {
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

    public LocalDateTime getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDateTime initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDateTime getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(LocalDateTime devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public BorrowState getState() {
        return state;
    }

    public void setState(BorrowState state) {
        this.state = state;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
}
