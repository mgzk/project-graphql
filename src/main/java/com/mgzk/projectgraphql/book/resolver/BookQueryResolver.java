package com.mgzk.projectgraphql.book.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mgzk.projectgraphql.book.model.Book;
import com.mgzk.projectgraphql.book.service.BookService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookQueryResolver implements GraphQLQueryResolver {
    private final BookService bookService;

    public List<Book> getBooks(final int count) {
        return bookService.get(count);
    }

    public Optional<Book> getBook(final Long id) {
        return bookService.getById(id);
    }
}

