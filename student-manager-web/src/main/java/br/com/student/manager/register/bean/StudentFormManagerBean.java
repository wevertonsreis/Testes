package br.com.student.manager.register.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.student.manager.bo.Student;
import br.com.student.manager.dao.StudentDAO;

@ManagedBean
@RequestScoped
public class StudentFormManagerBean {
	
	private StudentDAO studentDAO;
	
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void save() {
		studentDAO.persist(student);
	}
	
}
