package Decorator;

public class Main {
	public static void main(String[] args)
	{
		BasePizza vegDelight = new MushroomToppings(new ExtraCheeseToppings(new VegDelight()));
		BasePizza farmHouse = new MushroomToppings(new ExtraCheeseToppings(new FarmHouse()));
		BasePizza vegMushrooms = new MushroomToppings(new VegDelight());
		
		System.out.println(vegDelight.cost());
		System.out.println(farmHouse.cost());
		System.out.println(vegMushrooms.cost());
	}
}
