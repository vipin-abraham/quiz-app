package com.example.demo.entities;

import java.util.Map;

import javax.persistence.AttributeConverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AnswersConverter implements AttributeConverter<Map<Question,String>, String> {

	@Override
	public String convertToDatabaseColumn(Map<Question,String> questions) {
		try {
			return new ObjectMapper().writeValueAsString(questions);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}

	
	

	@Override
	public Map<Question,String> convertToEntityAttribute(String dbData) {
		try {
			return new ObjectMapper().readValue(dbData,new TypeReference<Map<Question,String>>(){});
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

}
