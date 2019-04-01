package org.o7planning.sbsecurity.Service;

import java.util.List;
import java.util.Optional;

import org.o7planning.sbsecurity.Entity.Employee;
import org.o7planning.sbsecurity.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}
}
