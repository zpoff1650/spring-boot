package com.locallyhosted.basecase.springboot.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractRepository<T extends BaseEntity> extends JpaRepository<T, Long>, QuerydslPredicateExecutor<T> {
}
