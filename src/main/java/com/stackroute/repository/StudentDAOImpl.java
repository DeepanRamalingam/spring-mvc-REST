package com.stackroute.repository;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.model.Student;

public class StudentDAOImpl {
	
	public Student FindStudent() {
		
		Student stud1 = new Student(100,"Deepan","CSE");
		return stud1;
	}
	
	public List<Student> findAll(){
		
		Student stud2 = new Student(101,"Renu","IT");
		Student stud3 = new Student(102,"Sriram","CSE");
		Student stud4 = new Student(103,"Sibhi","Auto");
		List<Student> studs = new ArrayList<Student>();
		studs.add(stud2);
		studs.add(stud3);
		studs.add(stud4);
		return studs;
	}
}
