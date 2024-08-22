package riwi.bezos.virtual_book.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import riwi.bezos.virtual_book.enums.BookCopyState;

import java.sql.Date;

@Entity
@Table(name = "BookCopy")
public class BookCopy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "bookId", nullable = false)
    private Book book;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BookCopyState state;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createDate;

    @LastModifiedDate
    @Column(nullable = false)
    private Date updateDate;

    // Constructors, getters, and setters
}
