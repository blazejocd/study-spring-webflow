package pl.blaise.pizza.flow;

import static org.apache.log4j.Logger.*;
import static pl.blaise.pizza.domain.PaymentType.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.blaise.pizza.domain.*;
import pl.blaise.pizza.service.CustomerNotFoundException;
import pl.blaise.pizza.service.CustomerService;

@Component
public class PizzaFlowActions 
{
	@Autowired
	private CustomerService customerService;
	
	private static final Logger LOGGER = getLogger(PizzaFlowActions.class);
	
	public Customer lookupCustomer(String phone)
		throws CustomerNotFoundException
	{
		Customer customer = customerService.lookupCustomer(phone);
		if (customer != null) {
			return customer;
		}
		else {
			throw new CustomerNotFoundException();
		}
	}
	
	public void saveOrder(Order order)
	{
		LOGGER.warn("TODO: Flas out the saveOrder() method."); 
	}
	
	public boolean checkDeliveryArea(String zipCode)
	{
		LOGGER.warn("TODO: Flash out the checkDeliveryArea() method.");
		return "31480".equals(zipCode);
	}
	
	public void addCustomer(Customer customer)
	{
		LOGGER.warn("TODO: Flash out the addCustomer() method.");
	}
	
	public Payment verifyPayment(PaymentDetails paymentDetails)
	{
		Payment payment;
		if (paymentDetails.getPaymentType() == CREDIT_CARD) {
			payment = new CreditCardPayment();
		}
		else {
			payment = new CashOrCheckPayment();
		}
		return payment;
	}
}
