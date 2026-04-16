package com.api.book.bootrestbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.Dao.BookRespository;
import com.api.book.bootrestbook.entities.Book;

@Component
public class BookService {

  
    @Autowired
    private BookRespository bookRespository;

    
    //get all books
    public List<Book> getAllBooks(){
        List<Book> list= (List<Book>) this.bookRespository.findAll();
        return list;
    }

    //get single book by id
    public Book getBookById(int id){
        Book book = null;
        try {
            book=this.bookRespository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }


    //create a book
    public  Book addBook(Book b){
        Book result =  bookRespository.save(b);
        return result;
    }

    //delete the book
    public void deleteBook(int bid){
        bookRespository.deleteById(bid);
    }

    //update the book
    public void updateBook(Book book, int bookId){
        book.setId(bookId);
        bookRespository.save(book);
    }
}