package com.code.bibliothequeenligne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.bibliothequeenligne.entite.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
