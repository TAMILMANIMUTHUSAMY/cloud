package it.sella.employees.employees.model;

/**
 * author    : gbs04229
 * Created on: Jan 07, 2019 15:41:21
 * Project   : employees
 * File Name : Employee.java
 */
public class Employee {

    private Long id;
    private String name;
    private String manager;

    public Employee(Long id, String name, String manager) {
        this.id = id;
        this.name = name;
        this.manager = manager;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }
}
