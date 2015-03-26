package br.com.student.manager.bo;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_Person")
public class Student extends Person {

	private static final long serialVersionUID = 7062316389970335021L;
	
	private String register;

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

}