package Decorator;

public class MushroomToppings extends ToppingsDecorator{
	public MushroomToppings(BasePizza basePizza)
	{
		super(basePizza);
	}
	

	public int cost()
	{
		return basePizza.cost() + 20;
	}
}
