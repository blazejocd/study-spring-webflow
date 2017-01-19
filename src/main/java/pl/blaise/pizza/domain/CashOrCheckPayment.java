package pl.blaise.pizza.domain;

public class CashOrCheckPayment extends Payment
{
	private static final long serialVersionUID = 1L;
	
	public String toString()
	{
		return "Cash or Check payment: $" +this.getAmount();
	}
}
