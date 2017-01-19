package pl.blaise.pizza.service;

import static org.apache.log4j.Logger.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import pl.blaise.pizza.domain.Order;
import pl.blaise.pizza.domain.Pizza;
import pl.blaise.pizza.domain.PizzaSize;

@SuppressWarnings("serial")
public class PricingEngineImpl 
	implements PricingEngine, Serializable 
{
	private static final Logger LOGGER = getLogger(PricingEngineImpl.class);
	private static Map<PizzaSize, Float> SIZE_PRICES;
	static {
		SIZE_PRICES	= new HashMap<>();
		SIZE_PRICES.put(PizzaSize.SMALL, 6.99f);
		SIZE_PRICES.put(PizzaSize.MEDIUM, 7.99f);
		SIZE_PRICES.put(PizzaSize.LARGE, 8.99f);
		SIZE_PRICES.put(PizzaSize.GINORMOUS, 9.99f);
	}
	
	private static float PRICE_PER_TOPPING = 0.20f;
	
	@Override
	public float calculateOrderTotal(Order order) 
	{
		LOGGER.debug("Calculating order total.");
		float total = 0.0f;
		for (Pizza pizza : order.getPizzas())
		{
			float pizzaPrice = SIZE_PRICES.get(pizza.getSize());
			if (pizza.getToppings().size() > 2) {
				pizzaPrice += (pizza.getToppings().size() * PRICE_PER_TOPPING);
			}
			total += pizzaPrice;
		}
		return total;
	}
}
