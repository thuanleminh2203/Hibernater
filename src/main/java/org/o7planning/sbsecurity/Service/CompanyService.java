package org.o7planning.sbsecurity.Service;

import java.util.List;
import java.util.Optional;

import org.o7planning.sbsecurity.Entity.Company;
import org.o7planning.sbsecurity.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository ;
	
	public Company create(Company company) {
		return companyRepository.save(company);
	}
	
	public List<Company> findAll(){
		return companyRepository.findAll();
	}

	public Optional<Company> findById( int id){
		return companyRepository.findById(id);
	}
	public Company update(Company company) {
		return companyRepository.save(company);
	}
	
}
