package com.abhi.restsample.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.abhi.restsample.dto.Student;

import jakarta.annotation.PostConstruct;



@Component
public class StudentDaoImpl implements StudentDao {
	
    List<Student> list=new ArrayList<>();
    
    @PostConstruct
    public void Initializer() {
    	list=new ArrayList<>();
    	list.add(new Student(1,"Abhishek","Betul"));
    	list.add(new Student(2,"Uju","Nagpur"));
    	list.add(new Student(3,"Tambu","Bhopal"));
    }
    
	@Override
	public Student getStudent(int id) {
		return list.stream().filter(student->student.getRollNo()==id).findFirst().orElse(null);
	}

	@Override
	public Student addStudent(Student student) {
		list.add(student);
		return list.stream().filter(st->st.getRollNo()==student.getRollNo()).findFirst().get();
	}

	@Override
	public Student getStudentByName(String name) {
		
		return list.stream().filter(student->student.getName().equals(name)).findFirst().orElse(null);
	}

	@Override
	public int getStudentListSize() {
		return list.size();
	}

}
