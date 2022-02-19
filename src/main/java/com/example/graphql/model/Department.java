package com.example.graphql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Department {

    public Department(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @Column
    private long id;
    private String name;

    @OneToMany
    @JoinColumn(name = "DEPARTMENT_ID")
    private List<Employee> employees = new ArrayList<>();
}
