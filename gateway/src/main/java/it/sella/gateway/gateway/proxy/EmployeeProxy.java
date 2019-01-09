package it.sella.gateway.gateway.proxy;

import it.sella.gateway.gateway.proxy.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * author    : gbs04229
 * Created on: Jan 08, 2019 14:27:30
 * Project   : gateway
 * File Name : EmployeeProxy.java
 */
//@FeignClient(name = "EMPLOYEE", path = "/employees", url = "http://localhost:8040")
@FeignClient(name = "EMPLOYEE")
public interface EmployeeProxy {

    //@GetMapping
    @GetMapping("/employees")
    public Employee getEmpoyee();
}
