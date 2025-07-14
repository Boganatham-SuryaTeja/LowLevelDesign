package Strategy;

public class Vehicle {
	DriveStrategy ds;
	
	Vehicle (DriveStrategy ds)
	{
		this.ds = ds;
	}
	
	public void drive()
	{
		ds.drive();
	}
}
