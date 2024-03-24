package com.murariwalake.demorestapi.controller;

import java.util.ArrayList;
import java.util.List;

import com.murariwalake.demorestapi.model.Student;
import org.springframework.http.ResponseEntity;
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

	private final List<Student> students;

	public StudentRestController() {
		students = new ArrayList<>();
		students.add(new Student(1, "Murari Walake", 25));
		students.add(new Student(2, "John Doe", 30));
	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable String id) {
		return students.stream()
				.filter(student -> student.getId() == Integer.parseInt(id))
				.findFirst()
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping()
	public ResponseEntity<List<Student>> getStudents() {
		return ResponseEntity.ok(students);
	}

	@PostMapping()
	public ResponseEntity<?> addStudent(@RequestBody Student student) {
		if (students.stream().anyMatch(s -> s.getId() == student.getId())) {
			return ResponseEntity.status(409).build();
		}
		students.add(student);
		return ResponseEntity.ok(student);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateStudent(@PathVariable String id, @RequestBody Student student) {
		return students.stream()
				.filter(s -> s.getId() == Integer.parseInt(id))
				.findFirst()
				.map(s -> {
					s.setAge(student.getAge());
					s.setName(student.getName());
					return ResponseEntity.ok(s);
				})
				.orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable String id) {
		return students.removeIf(student -> student.getId() == Integer.parseInt(id))
				? ResponseEntity.ok().build()
				: ResponseEntity.notFound().build();
	}
}
