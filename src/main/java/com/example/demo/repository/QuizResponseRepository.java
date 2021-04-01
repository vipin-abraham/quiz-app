package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entities.QuizResponse;

public interface QuizResponseRepository extends PagingAndSortingRepository<QuizResponse, Integer> {

}
