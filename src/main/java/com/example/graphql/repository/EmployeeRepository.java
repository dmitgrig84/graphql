package com.example.graphql.repository;

import com.example.graphql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.graphql.data.GraphQlRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long>,
    JpaSpecificationExecutor<Employee> {

}
