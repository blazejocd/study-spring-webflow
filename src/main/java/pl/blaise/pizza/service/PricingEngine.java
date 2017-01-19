package pl.blaise.pizza.service;

import pl.blaise.pizza.domain.Order;

public interface PricingEngine 
{
	public float calculateOrderTotal(Order order);
}
