package com.mgzk.projectgraphql.book.repository;

import com.mgzk.projectgraphql.book.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
