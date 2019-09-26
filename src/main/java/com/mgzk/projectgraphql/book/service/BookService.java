package com.mgzk.projectgraphql.book.service;

import com.mgzk.projectgraphql.book.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> get(int count);
    Optional<Book> getById(Long id);
    Book create(String ISBN, String publisher, String title, String[] authors);
}
