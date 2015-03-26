package br.com.student.manager.dao;

import java.util.List;

import br.com.student.manager.bo.Student;

public interface StudentDAO {
	
	public List<Student> findAll();
	
	public Student findById(Object id);
	
	public void persist(Student student);
	
}
