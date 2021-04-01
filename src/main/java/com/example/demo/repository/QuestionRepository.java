package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entities.Question;
public interface QuestionRepository extends PagingAndSortingRepository<Question, Integer>{

}
