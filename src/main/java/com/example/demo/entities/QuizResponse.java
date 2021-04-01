package com.example.demo.entities;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class QuizResponse {
	@Id
	@Column(name="RESPONSE_ID")
	@GeneratedValue
	private Integer id;
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Quiz quiz;
	@Convert(converter=AnswersConverter.class)
	private Map<Question,String> answers;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public Map<Question, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Question, String> answers) {
		this.answers = answers;
	}

}
