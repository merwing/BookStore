package com.example.bookstore.repository;

import com.example.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    Repozytorium dostarczające podstawowe metody do operacji na bazie danych
    pozwalające np wyszukać obiekty, wyszukać konkretny obiekt, zapisać, usunąć itd
*/
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
