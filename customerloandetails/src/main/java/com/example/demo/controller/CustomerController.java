package com.example.demo.controller;

import com.example.demo.entity.LoanCustomer;
import com.example.demo.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerService service;

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @Autowired
    private Environment env;

    @GetMapping(value = "/port")
    public String getPort(){

        String portNumber = env.getProperty("local.server.port");

        return portNumber+instanceId;
    }

    @GetMapping("/customer/sort/{propName}")
    public Iterable<LoanCustomer> showSortBy(@PathVariable("propName") String propName){

        String portNumber = env.getProperty("local.server.port");

        log.info("Request Handled by application in "+portNumber);

        return this.service.sortBy(propName);
    }

    @GetMapping("/customer/paginate/{pageNo}/{size}/{propName}")
    public Page<LoanCustomer> paginate(@PathVariable("pageNo") int pageNo, @PathVariable("size") int size, @PathVariable("propName") String propName){
        return this.service.paginate(pageNo,size,propName);
    }

    @GetMapping(value = "/customer")
    public Iterable<LoanCustomer> findAllCustomers(){

        return this.service.getAll();
    }

    @PostMapping(value = "/customer", produces = "application/json", consumes = "application/json")
    public LoanCustomer add(@RequestBody LoanCustomer cust){

        return this.service.add(cust);
    }

}
