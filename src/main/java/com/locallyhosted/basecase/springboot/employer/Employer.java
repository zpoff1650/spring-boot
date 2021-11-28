package com.locallyhosted.basecase.springboot.employer;

import com.locallyhosted.basecase.springboot.core.BaseEntity;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employer")
@Getter
@Setter
public class Employer extends BaseEntity {

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "code")
    private String code;

    @Override
    public String toString() {
        return "{Name: " + name + " Code: " + code + "}";
    }

}
