package Decorator;

public abstract class ToppingsDecorator implements BasePizza{
	BasePizza basePizza;
	public ToppingsDecorator(BasePizza basePizza)
	{
		this.basePizza = basePizza;
	}
	
	public abstract int cost();
}
