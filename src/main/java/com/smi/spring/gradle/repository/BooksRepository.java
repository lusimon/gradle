package com.smi.spring.gradle.repository;

import org.springframework.data.repository.CrudRepository;

import com.smi.spring.gradle.model.Books;

//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  
