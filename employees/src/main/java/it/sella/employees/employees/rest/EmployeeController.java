package it.sella.employees.employees.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import it.sella.employees.employees.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties;
import org.springframework.boot.autoconfigure.hateoas.HateoasProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * author    : gbs04229
 * Created on: Jan 07, 2019 15:40:49
 * Project   : employees
 * File Name : EmployeeController.java
 */
@RestController
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @HystrixCommand(fallbackMethod = "getEmployeeFallBack", commandKey = "FBC1", groupKey = "FBG1")
    @GetMapping(path = "/employees")
    public Employee getEmpoyee() {
        logger.info("Entered into getEmpoyee!...");
        if (new Random().nextBoolean()) {
            throw new RuntimeException("TEST HYSTRIX!..");
        }
        logger.info("Leaving into getEmpoyee!...");
        return new Employee(4229L,"Tamilmani", "BharathKumar");
    }

    @HystrixCommand(fallbackMethod = "getEmployeeFallBack", commandKey = "FBC2", groupKey = "FBG2")
    @GetMapping(path = "/employees1")
    public Employee getEmpoyee1() {
        logger.info("Entered into getEmpoyee1!...");
        if (new Random().nextBoolean()) {
            throw new RuntimeException("TEST HYSTRIX!..");
        }
        logger.info("Leaving into getEmpoyee1!...");
        return new Employee(4229L,"Tamilmani", "BharathKumar");
    }

    public Employee getEmployeeFallBack() {
        return new Employee(1L,"XXXX", "FallBack");
    }
}
