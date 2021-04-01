package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Question {
	@Id
	@GeneratedValue
	@Column(name="QUESTION_ID")
	private Integer id;
	@Convert(converter=PossibleAnswersConverter.class)
	private String questionStatement;
	private List<String> possibleAnswers;
	private String actualAnswer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getPossibleAnswers() {
		return possibleAnswers;
	}
	public void setPossibleAnswers(List<String> possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}
	public String getActualAnswer() {
		return actualAnswer;
	}
	public void setActualAnswer(String actualAnswer) {
		this.actualAnswer = actualAnswer;
	}
}
