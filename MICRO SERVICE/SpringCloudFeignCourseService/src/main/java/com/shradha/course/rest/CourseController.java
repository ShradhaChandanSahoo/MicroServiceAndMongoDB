package com.shradha.course.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shradha.course.model.Course;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@PostMapping("/save")
	public ResponseEntity<String> saveCourse(Course course){
		return new ResponseEntity<String>("Course Id "+course.getId()+" Is saved Succefully",HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List <Course>> getAllCourses(){
		return new ResponseEntity<List <Course>>(
					Arrays.asList(new Course(12, "Math", 45.876),
							      new Course(13, "Science",78.67),
							      new Course(14, "English", 65.90)),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer id){
		return new ResponseEntity<String>("Course "+id+" Is Deleted.",HttpStatus.OK);
	}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<Course> getOneCourse(@PathVariable Integer id) {
		return new ResponseEntity<Course>(new Course(id, "Science", 78.67),HttpStatus.OK);
	}

}
