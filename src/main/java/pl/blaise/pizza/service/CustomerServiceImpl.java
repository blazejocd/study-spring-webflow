package pl.blaise.pizza.service;

import pl.blaise.pizza.domain.Customer;

public class CustomerServiceImpl implements CustomerService 
{

	@Override
	public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException 
	{
		if ("53711304".equals(phoneNumber))
		{
			Customer c = new Customer();
			c.setId(22);
			c.setName("Błażej Kocik");
			c.setAddress("ul. Strusia 89");
			c.setCity("Kraków");
			c.setState("małopolskie");
			c.setZipCode("31480");
			c.setPhoneNumber("537111304");
			
			return c;
		}
		else {
			throw new CustomerNotFoundException();
		}
	}
	
}
