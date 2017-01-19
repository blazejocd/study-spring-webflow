package pl.blaise.pizza.service;

import pl.blaise.pizza.domain.Customer;

public interface CustomerService 
{
	Customer lookupCustomer(String phoneNumber) 
			throws CustomerNotFoundException;
}
