package org.o7planning.sbsecurity.Controller;

import java.util.List;

import org.o7planning.sbsecurity.Entity.Employee;
import org.o7planning.sbsecurity.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/findAll")
	public ResponseEntity<List<Employee>> findAll() {
		return new ResponseEntity<List<Employee>>(employeeService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<Employee> findById(@PathVariable int id){
		return new ResponseEntity<Employee>(employeeService.findById(id).get(),HttpStatus.OK);
	}
}
