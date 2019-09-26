package com.mgzk.projectgraphql.book.repository;

import com.mgzk.projectgraphql.book.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
