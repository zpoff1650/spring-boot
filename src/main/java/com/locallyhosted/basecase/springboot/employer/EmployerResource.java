package com.locallyhosted.basecase.springboot.employer;

import com.locallyhosted.basecase.springboot.employer.dto.EmployerDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class EmployerResource {

    private final EmployerService employerService;

    @GetMapping(value = "/api/employer-service/find-all")
    public ResponseEntity<List<EmployerDTO>> findAll() {
        return ResponseEntity.ok().body(employerService.findAllDTOs());
    }

}
