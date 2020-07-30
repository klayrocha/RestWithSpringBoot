package com.klayrocha.restwithspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klayrocha.restwithspringboot.data.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
