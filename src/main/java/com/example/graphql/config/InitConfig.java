package com.example.graphql.config;

import com.example.graphql.model.Department;
import com.example.graphql.model.Employee;
import com.example.graphql.repository.DepartmentRepository;
import com.example.graphql.repository.EmployeeRepository;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitConfig {

    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;


    @PostConstruct
    public void init() {
        Department department = Department.builder().name("dep1").build();
        departmentRepository.save(department);
        employeeRepository.save(Employee.builder().name("emp1").department(department).build());
        employeeRepository.save( Employee.builder().name("emp2").department(department).build());
        employeeRepository.save( Employee.builder().name("emp3").department(department).build());
    }
}
