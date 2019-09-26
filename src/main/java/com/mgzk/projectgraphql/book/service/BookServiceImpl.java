package com.mgzk.projectgraphql.book.service;

import com.mgzk.projectgraphql.book.model.Author;
import com.mgzk.projectgraphql.book.model.Book;
import com.mgzk.projectgraphql.book.repository.BookRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> get(int count) {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book create(String ISBN, String genre, String title, String[] authors) {
        Book book = Book.builder()
                .ISBN(ISBN)
                .genre(genre)
                .title(title)
                .authors(Stream.of(authors)
                        .map(author -> Author.builder()
                                .name(author)
                                .build())
                        .collect(Collectors.toList()))
                .build();
        return bookRepository.save(book);
    }

}
