package com.locallyhosted.basecase.springboot.employer;

import com.locallyhosted.basecase.springboot.core.AbstractRepository;
import com.locallyhosted.basecase.springboot.employer.dto.EmployerDTO;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployerRepository extends AbstractRepository<Employer> {

    @Query("SELECT new com.locallyhosted.basecase.springboot.employer.dto.EmployerDTO(e.id, e.name, e.code) from Employer e")
    List<EmployerDTO> findAllDTOs();

}
