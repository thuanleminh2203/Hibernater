package org.o7planning.sbsecurity.Repository;

import java.util.List;

import org.o7planning.sbsecurity.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	@Override
	@Query("FROM Employee e join fetch e.company Company")
	List<Employee> findAll();
}
