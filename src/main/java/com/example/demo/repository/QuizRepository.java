package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entities.Quiz;

public interface QuizRepository extends PagingAndSortingRepository<Quiz,Integer> {

}
