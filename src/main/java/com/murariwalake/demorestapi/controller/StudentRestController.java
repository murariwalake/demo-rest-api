package com.murariwalake.demorestapi.controller;

import java.util.List;

import com.murariwalake.demorestapi.model.Student;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/students")
public class StudentRestController {

	//get student by id
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable String id) {
		Student student = new Student();
		student.setId(Integer.parseInt(id));
		student.setName("Murari Walake");
		student.setAge(25);
		return student;
	}

	//get all students
	@GetMapping()
	public List<Student> getStudents() {
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Murari Walake");
		student1.setAge(25);

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("John Doe");
		student2.setAge(30);

		return List.of(student1, student2);
	}

	//add student
	@PostMapping()
	public Student addStudent(@RequestBody Student student) {
		return student;
	}

	//update student
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable String id, @RequestBody Student student) {
		return student;
	}

	//delete student
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable String id) {
		System.out.println("Student deleted with id: "+id);
	}

}
