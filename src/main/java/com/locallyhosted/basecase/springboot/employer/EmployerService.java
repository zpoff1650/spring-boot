package com.locallyhosted.basecase.springboot.employer;

import com.locallyhosted.basecase.springboot.employer.dto.EmployerDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployerService {

    private final EmployerRepository employerRepository;

    public List<EmployerDTO> findAllDTOs() {
        return employerRepository.findAllDTOs();
    }

}
