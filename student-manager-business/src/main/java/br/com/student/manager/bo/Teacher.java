package br.com.student.manager.bo;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_Person")
public class Teacher extends Person {

	private static final long serialVersionUID = -5449781107613829084L;
	
}
