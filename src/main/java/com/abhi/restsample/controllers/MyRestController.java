package com.abhi.restsample.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.restsample.dao.StudentDao;
import com.abhi.restsample.dto.ErrorResponseClass;
import com.abhi.restsample.dto.Student;
import com.abhi.restsample.exception.StudentNotFoundException;

@RestController
public class MyRestController {
	
	@Autowired
	StudentDao studentDao;
	
	@GetMapping(value="/student/{id}")
	public Student getStudent(@PathVariable("id") int id) throws StudentNotFoundException {
		int numberOfStudents=studentDao.getStudentListSize();
		if(numberOfStudents<id) {
			throw new StudentNotFoundException("Student not present");
		}
		return studentDao.getStudent(id);
	
	}
	
	@GetMapping(value = "/student/{name}",params = "abc",produces = MediaType.APPLICATION_XML_VALUE)
	public Student getStudentByName(@PathVariable String name,@RequestParam("abc") String noUse) {
		return studentDao.getStudentByName(name);
	
	}
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		 Student student2 = studentDao.addStudent(student);
		 return ResponseEntity.status(HttpStatus.CREATED).body(student2);
	
	}
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorResponseClass> handleException(StudentNotFoundException exception){
		ErrorResponseClass response=new ErrorResponseClass();
		response.setClassName(exception.getClass().toString());
		response.setDate(new Date());
		response.setMessage(exception.getMessage());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}

}
