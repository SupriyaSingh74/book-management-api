package com.api.book.bootrestbook.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String FirstName;
    private String LastName;
    private String Lanuage;

    @OneToOne(mappedBy="author")
    @JsonBackReference
    private Book book;

    public Author(Book book,String Lanuage, String LastName, String FirstName, int id) {
        this.book=book;
        this.Lanuage = Lanuage;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.id = id;
    }

    public Author() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getLanuage() {
        return Lanuage;
    }

    public void setLanuage(String Lanuage) {
        this.Lanuage = Lanuage;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Lanuage=" + Lanuage
                + ", book=" + book + "]";
    }

    

}
