package br.com.student.manager.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public abstract class GenericDAO<T> {
	
	@PersistenceContext
	protected EntityManager manager;
	
	protected Class<T> entity;
	
	public List<T> findAll() {
		TypedQuery<T> query = manager.createQuery("SELECT FROM "+entity, entity);
		return query.getResultList();
	}
	
	public T findById(Object id) {
		return manager.find(entity, id);
	}
	
	public void persist(T entity) {
		manager.persist(entity);
	}
	
}
