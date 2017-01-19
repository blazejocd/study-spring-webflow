package pl.blaise.pizza.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;

import pl.blaise.pizza.service.PricingEngine;

@Configurable("order")
public class Order implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Customer customer;
	private List<Pizza> pizzas;
	private Payment payment;
	private PricingEngine pricingEngine;
	
	public Order()
	{
		this.pizzas = new ArrayList<Pizza>();
		this.customer = new Customer();
	}
	
	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	
	public void addPizza(Pizza pizza) {
		this.pizzas.add(pizza);
	}
	
	public List<Pizza> getPizzas() {
		return this.pizzas;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public float getTotal()
	{
		return 0.0f;
	}
	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public Payment getPayment() {
		return this.payment;
	}
	
	public void setPricingEngine(PricingEngine pricingEngine)
	{
		this.pricingEngine = pricingEngine;
	}
}
