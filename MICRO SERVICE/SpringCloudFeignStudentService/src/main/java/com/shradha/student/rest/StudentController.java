package com.shradha.student.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shradha.student.consumer.CourseRestCosumer;
import com.shradha.student.model.Course;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private CourseRestCosumer courseRestCosumer;
	
	@PostMapping("/create")
	public String createCourse() {
		Course course = new Course(15,"History",45.78);
		return "From Student==>"+courseRestCosumer.saveCourse(course);
	}
	
	@GetMapping("/fetch")
	public String fetchAllCourses() {
		return "From Student==>"+courseRestCosumer.getAllCourses();
	}
	
	@GetMapping("/one")
	public String getMyOneCourse() {
		return "From Student==>"+courseRestCosumer.getOneCourse(13);
	}
	
	@DeleteMapping("/remove")
	public String removeCourse() {
		return "From Student==>"+courseRestCosumer.deleteCourse(14);
	}

}
