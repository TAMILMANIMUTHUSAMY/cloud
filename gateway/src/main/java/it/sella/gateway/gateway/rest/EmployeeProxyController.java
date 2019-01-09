package it.sella.gateway.gateway.rest;

import it.sella.gateway.gateway.proxy.EmployeeProxy;
import it.sella.gateway.gateway.proxy.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * author    : gbs04229
 * Created on: Jan 07, 2019 15:40:49
 * Project   : employees
 * File Name : EmployeeController.java
 */
@RestController
public class EmployeeProxyController {

    @Autowired
    private EmployeeProxy proxy;

    @LoadBalanced
    @Bean
    private RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/emp")
    public Employee getEmpoyee() {
        return proxy.getEmpoyee();
    }

    @GetMapping("/emp-restTemplate")
    public Employee getEmp() {
        return restTemplate.getForObject("http://EMPLOYEE/employees", Employee.class);
    }
}
