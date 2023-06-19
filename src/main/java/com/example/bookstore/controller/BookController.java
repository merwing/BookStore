package com.example.bookstore.controller;

import com.example.bookstore.entity.Book;
import com.example.bookstore.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping("/")
    public String getAllBooks() {
        List<Book> books = bookRepository.findAll(); //pobranie wszyskich obiektów typu book z bazy ("CRUD" select * from books)
        StringBuilder sb = new StringBuilder();
        sb.append("<html>\n<style>\n" +
                "table, th, td {\n" +
                "  border:1px solid black;\n" +
                "}\n" +
                "</style><h1>LIBRARY</h1>\n<div>\n<table>\n"); //tworzenie odpowiedzi typu String, która generuje html
        sb.append("<tr>\n<th>TITLE</th><th>NAME</th><th>SURNAME</th><th>DATE OF PUBLICATION</th>\n</tr>\n");
        for(int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            sb.append("<tr><td>"+book.getTitle()+"</td>\n");
            sb.append("<td>"+book.getName()+"</td>\n");
            sb.append("<td>"+book.getSurname()+"</td>\n");
            sb.append("<td>"+book.getDateOfPublication()+"</td>\n</tr>\n");
        }
        sb.append("</table>\n</div>\n</html>");
        return sb.toString();
    }

    @GetMapping("/book/{id}")
    public Book getSingleBook(@PathVariable Integer id) {
        return bookRepository.findById(id).get(); //pobranie ksiazki po id
    }

    @PostMapping("/")
    public Integer createNewBook(@RequestBody Book book){
        return bookRepository.save(book).getId();  //dodanie książki po request body
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Integer id) {
        bookRepository.deleteById(id);  //usuniecie ksiazki po id
    }
}
