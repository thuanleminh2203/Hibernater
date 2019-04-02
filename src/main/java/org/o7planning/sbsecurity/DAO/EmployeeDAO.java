package org.o7planning.sbsecurity.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.o7planning.sbsecurity.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class EmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	
	public List<Employee> findAll(){
	
		return entityManager.createQuery("FROM Employee").getResultList();
	}
}
