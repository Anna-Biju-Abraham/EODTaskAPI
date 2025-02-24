package com.signify1.BookStore.repository;

import com.signify1.BookStore.models.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Long>
{
}
