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
	
	@Autowired  
	CustomerRepository customerRepositoy;
	
	private ArrayList<Employee> employee = new ArrayList<Employee>();
	
	
    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public void create(@RequestBody Customer customer) {
    	customerRepositoy.save(customer);
    }
    
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public Customer get(@PathVariable("id") Integer id) {

     Optional<Customer> optCustomer = customerRepositoy.findById(id);
     return optCustomer.get();
    }
    
    @RequestMapping(value = "/customer/active", method = RequestMethod.GET)
    public Collection<Customer> getActive() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
    	return customerRepositoy.getAllActive();	
    }    
    
    
    @RequestMapping(value = "/customer/actived", method = RequestMethod.GET)
    public Collection<Customer> getActived() throws InterruptedException {
   
    TimeUnit.SECONDS.sleep(2);
    return customerRepositoy.getAllActive();	
    }

}	