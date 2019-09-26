package com.mgzk.projectgraphql.book.data;

import com.mgzk.projectgraphql.book.model.Author;
import com.mgzk.projectgraphql.book.model.Book;
import com.mgzk.projectgraphql.book.repository.AuthorRepository;
import com.mgzk.projectgraphql.book.repository.BookRepository;

import org.springframework.stereotype.Service;

import java.util.Collections;

import javax.annotation.PostConstruct;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DataProvider {

    private final BookRepository bookRepository;

    private final AuthorRepository authorRepository;

    @PostConstruct
    public void init() {
        Author tolkien = Author.builder()
                .name("J. R. R. Tolkien")
                .build();

        tolkien = authorRepository.save(tolkien);

        Book first = Book.builder()
                .ISBN("1-4028-9462-7")
                .title("The Lord of the Rings")
                .authors(Collections.singletonList(tolkien))
                .genre("fantasy")
                .build();

        bookRepository.save(first);

        Book second = Book.builder()
                .ISBN("978-1-4028-9462-6")
                .title("The Hobbit")
                .authors(Collections.singletonList(tolkien))
                .genre("fantasy")
                .build();

        bookRepository.save(second);
    }
}
