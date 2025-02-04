package com.rantisi.library.repository;

import com.rantisi.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LibraryRepo extends JpaRepository<Book, Integer> {



}
