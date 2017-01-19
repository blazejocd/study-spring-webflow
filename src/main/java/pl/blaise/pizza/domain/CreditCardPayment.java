package pl.blaise.pizza.domain;

public class CreditCardPayment extends Payment
{
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Credit Card payment: $" +this.getAmount();
	}
}
