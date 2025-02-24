package com.signify1.BookStore.controller;


import com.signify1.BookStore.models.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.signify1.BookStore.repository.BookRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BookStoreController
{
    @Autowired
    private BookRepository bookRepo;

    @Transactional
    @PostMapping("/bookEntry")

   public ResponseEntity<Map<String,String>> bookEntry(@RequestBody Books book)
    {
        Books bookObj= bookRepo.save(book);
        Map<String,String> response= new HashMap<>();
        response.put("Status","Book added");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/viewAllBooks")
    public ResponseEntity<List<Books>> bookList()
    {
        List<Books> book= bookRepo.findAll();
        return ResponseEntity.ok(book);
    }

}
