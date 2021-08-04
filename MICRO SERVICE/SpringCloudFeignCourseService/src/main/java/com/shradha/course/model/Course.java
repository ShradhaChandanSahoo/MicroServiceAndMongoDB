package com.shradha.course.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	
	private Integer id;
	private String courseName;
	private Double courseFee;

}
