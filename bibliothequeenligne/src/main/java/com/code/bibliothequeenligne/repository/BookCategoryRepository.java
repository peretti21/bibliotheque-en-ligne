package com.code.bibliothequeenligne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.bibliothequeenligne.entite.BookCategory;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="bookCategory", path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
