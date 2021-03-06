package com.shradha.mongo.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
	
	@Id
	private String id;
	
	@NonNull
	private String sname;
	@NonNull
	private Double sfee;
	
	@NonNull
	private List<String> subjects;
	
	@NonNull
	private Map<String,Double> subMarks;
	
	

}
