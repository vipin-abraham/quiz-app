package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Question;
import com.example.demo.repository.QuestionRepository;

@RestController
public class QuestionController {
	@Autowired
	private QuestionRepository repository;

	@PostMapping("/question")
	public Question saveQuestion(@RequestBody Question question) {
		return repository.save(question);
	}
	@GetMapping("/question")
	public Iterable<Question> listAllQuestions() {
		return repository.findAll();
	}
	
}
