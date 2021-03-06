package com.shradha.student.consumer;

import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.shradha.student.model.Course;

@FeignClient(name = "COURSE-SERVICE")
public interface CourseRestCosumer {

	@PostMapping("/course/save")
	public ResponseEntity<String> saveCourse(Course course);
	
	@GetMapping("/course/all")
	public ResponseEntity<List <Course>> getAllCourses();
	
	@DeleteMapping("/course/delete/{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer id);
	
	@GetMapping("/course/one/{id}")
	public ResponseEntity<Course> getOneCourse(@PathVariable Integer id);
}
