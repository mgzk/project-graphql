package com.mgzk.projectgraphql.book.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mgzk.projectgraphql.book.model.Book;
import com.mgzk.projectgraphql.book.service.BookService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookMutationResolver implements GraphQLMutationResolver {
    private final BookService bookService;

    public Book createBook(String ISBN, String publisher, String title) {
        return bookService.create(ISBN, publisher, title, new String[]{});
    }
}
