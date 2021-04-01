package com.example.demo.entities;

import java.util.List;

import javax.persistence.AttributeConverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class QuestionsConverter implements AttributeConverter<List<Question>, String> {

	@Override
	public String convertToDatabaseColumn(List<Question> questions) {
		try {
			return new ObjectMapper().writeValueAsString(questions);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Question> convertToEntityAttribute(String dbData) {
		try {
			return new ObjectMapper().readValue(dbData,new TypeReference<List<Question>>(){});
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
