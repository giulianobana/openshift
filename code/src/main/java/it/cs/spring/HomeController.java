package it.cs.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
    
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public Customer get(@PathVariable("id") Integer id) {
    
    Customer customer = new Customer();
    customer.setId(1);
    customer.setDescription("description");
    customer.setFirstName("firstName");
    return customer;
    }
    
}	