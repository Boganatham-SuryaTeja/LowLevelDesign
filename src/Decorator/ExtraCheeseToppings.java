package Decorator;

public class ExtraCheeseToppings extends ToppingsDecorator{
	public ExtraCheeseToppings(BasePizza basePizza)
	{
		super(basePizza);
	}
	
	public int cost()
	{
		return basePizza.cost() + 10;
	}
}
