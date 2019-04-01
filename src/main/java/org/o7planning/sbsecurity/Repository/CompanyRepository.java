package org.o7planning.sbsecurity.Repository;

import org.o7planning.sbsecurity.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}