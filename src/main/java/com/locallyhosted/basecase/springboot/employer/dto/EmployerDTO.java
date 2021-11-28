package com.locallyhosted.basecase.springboot.employer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerDTO {

    private Long id;

    private String name;

    private String code;

}
