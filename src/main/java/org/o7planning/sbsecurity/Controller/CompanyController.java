package org.o7planning.sbsecurity.Controller;

import java.util.List;

import org.o7planning.sbsecurity.Entity.Company;
import org.o7planning.sbsecurity.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@PostMapping("/creat/{name}")
	public ResponseEntity<Company> creat(Company company) {
		return new ResponseEntity<Company>(companyService.create(company), HttpStatus.OK);
	}
	@GetMapping("/findAll")
	public ResponseEntity<List<Company>> findAll(){
		return new ResponseEntity<List<Company>>(companyService.findAll(),HttpStatus.OK);
	}
	@GetMapping("/findById/{id}")
	public ResponseEntity<Company> findById(@PathVariable int id){
		return new ResponseEntity<Company>(companyService.findById(id).get(),HttpStatus.OK);
	}
}
