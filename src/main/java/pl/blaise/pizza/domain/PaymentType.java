package pl.blaise.pizza.domain;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.text.WordUtils;

public enum PaymentType 
{
	CASH, CHECK, CREDIT_CARD;
	
	public List<PaymentType> asList()
	{
		PaymentType[] list = PaymentType.values();
		return Arrays.asList(list);
	}
	
	public String toString()
	{
		return WordUtils.capitalizeFully(name().replace('_', ' '));
	}
}
