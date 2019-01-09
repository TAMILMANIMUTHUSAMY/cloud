package it.sella.gateway.gateway.proxy.model;

/**
 * author    : gbs04229
 * Created on: Jan 08, 2019 14:32:11
 * Project   : gateway
 * File Name : Employee.java
 */
public class Employee {
    private Long id;
    private String name;
    private String manager;

    public Employee() {
    }

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

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
