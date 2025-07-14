package Strategy;

public class Main {
	public static void main(String[] args)
	{
		Bike bike = new Bike(new TwoWheelStrategy());
		Car car = new Car(new FourWheelStrategy());
		Bus bus = new Bus(new FourWheelStrategy());
		
		bike.drive();
		car.drive();
		bus.drive();
	}
}
