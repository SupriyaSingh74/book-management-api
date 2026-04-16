package com.api.book.bootrestbook.Dao;

import org.springframework.data.repository.CrudRepository;

import com.api.book.bootrestbook.entities.Book;



public interface BookRespository extends CrudRepository<Book, Integer>{

    public Book findById(int id);    
}
