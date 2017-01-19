package pl.blaise.pizza.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.text.WordUtils;

public enum Topping implements Serializable 
{
	PEPPERONI,
	SAUSAGE,
	HAMBURGER,
	MUSHROOM,
	CANADAIAN_BACON,
	PINEAPPLE,
	GREEN_PEPPER;
	
	public static List<Topping> asList()
	{
		Topping[] all = Topping.values();
		return Arrays.asList(all);
	}
	
	public String toString()
	{
		return WordUtils.capitalizeFully(name().replace('_', ' '));
	}
}
