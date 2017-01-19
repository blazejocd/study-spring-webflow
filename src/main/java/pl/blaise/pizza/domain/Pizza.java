package pl.blaise.pizza.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Pizza implements Serializable
{
	private PizzaSize size;
	private List<Topping> toppings;
	
	public Pizza()
	{
		toppings = new ArrayList<>();
	}
	
	public PizzaSize getSize() {
		return this.size;
	}
	
	public void setSize(String sizeString) {
		this.size = PizzaSize.valueOf(sizeString);
	}
	
	public void setSize(PizzaSize size) {
		this.size = size;
	}
	
	public List<Topping> getToppings() {
		return this.toppings;
	}
	
	public void setToppings(List<Topping> toppings) {
		this.toppings = toppings;
	}
	
	public void setToppings(String[] toppingsStrings) {
		for (int i=0; i<toppingsStrings.length; i++) {
			this.toppings.add(Topping.valueOf(toppingsStrings[i]));
		}
	}
}
