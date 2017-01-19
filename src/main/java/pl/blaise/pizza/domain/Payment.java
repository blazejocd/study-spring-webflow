package pl.blaise.pizza.domain;

import java.io.Serializable;

public abstract class Payment implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private float amount;
	
	public void setAmount(float value)
	{
		this.amount = value;
	}
	
	public float getAmount()
	{
		return this.amount;
	}
}
