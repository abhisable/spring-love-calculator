package com.abhi.restsample.dao;

import com.abhi.restsample.dto.Student;

public interface StudentDao {

	 Student getStudent(int id);
	 Student addStudent(Student student);
	Student getStudentByName(String name);
	int getStudentListSize();
	
}
