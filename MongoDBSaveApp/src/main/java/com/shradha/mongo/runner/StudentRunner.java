package com.shradha.mongo.runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shradha.mongo.model.Student;
import com.shradha.mongo.model.StudentRepository;
import com.shradha.mongo.util.GenerateId;

@Component
public class StudentRunner implements CommandLineRunner {
	
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		HashMap<String,Double> map = new HashMap<String,Double>();
		map.put("Math", 98.99);
		map.put("Science", 67.89);
		HashMap<String,Double> map1 = new HashMap<String,Double>();
		map1.put("Math", 56.89);
		map1.put("Science", 47.79);
		HashMap<String,Double> map2 = new HashMap<String,Double>();
		map2.put("Math", 65.56);
		map2.put("Science", 43.89);
		HashMap<String,Double> map3 = new HashMap<String,Double>();
		map3.put("Math", 87.67);
		map3.put("Science", 56.77);
		
		repo.deleteAll();
		
		Student s = repo.save(new Student("Shradha",67.89,Arrays.asList("Math","Science"),map));
		repo.saveAll(Arrays.asList(
				new Student("AAA76","Subhadra",67.89,Arrays.asList("Math","Science"),map1),
				new Student(GenerateId.createId(),"Akshya",67.89,Arrays.asList("Math","Science"),map2),
				new Student(GenerateId.createId(),"Nibesh",67.89,Arrays.asList("Math","Science"),map3)));
		
		System.out.println(s.getId());
		
		List<Student> list = repo.findAll();
		list.forEach(System.out::println);
		
		Optional<Student> stu = repo.findById(s.getId());
		if(stu.isPresent())
			System.out.println(stu.get());
		else {
			System.out.println("This Id is Not present");
		}
		
		Optional<Student> st = repo.findBySname("Nibesh");
		if(st.isPresent())
			System.out.println(st.get());
		else {
			System.out.println("This Id is Not present");
		}
		
		System.out.println("___DONE__");
		
		
	

	}

}
