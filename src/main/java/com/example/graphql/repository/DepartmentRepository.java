package com.example.graphql.repository;

import com.example.graphql.model.Department;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.graphql.data.GraphQlRepository;

@GraphQlRepository
public interface DepartmentRepository extends CrudRepository<Department, Long>,
    QuerydslPredicateExecutor<Department> {
}
