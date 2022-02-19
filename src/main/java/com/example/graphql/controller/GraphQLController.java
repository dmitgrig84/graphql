package com.example.graphql.controller;

import com.example.graphql.model.Employee;
import com.example.graphql.repository.EmployeeRepository;
import com.intuit.graphql.filter.client.ExpressionFormat;
import com.intuit.graphql.filter.client.FilterExpression;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class GraphQLController {

    private final EmployeeRepository repository;

    @QueryMapping
    public List<Employee> employees(DataFetchingEnvironment dataFetchingEnvironment) {
        FilterExpression.FilterExpressionBuilder builder = FilterExpression
            .newFilterExpressionBuilder();
        FilterExpression filterExpression = builder.args(dataFetchingEnvironment.getArguments())
            .build();
        Specification<Employee> specification = filterExpression
            .getExpression(ExpressionFormat.JPA);
        return repository.findAll(specification);
    }

}
