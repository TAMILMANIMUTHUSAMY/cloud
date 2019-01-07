package it.sella.employees.employees.rest;

import it.sella.employees.employees.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author    : gbs04229
 * Created on: Jan 07, 2019 15:40:49
 * Project   : employees
 * File Name : EmployeeController.java
 */
@RestController
public class EmployeeController {

    @GetMapping(path = "/employees")
    public Employee getEmpoyee() {
        return new Employee(4229L,"Tamilmani", "BharathKumar");
    }
}
