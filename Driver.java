package oop_driver_taxi;

public class Driver extends User
{
	private Driveable vehicle = new Vehicle();
	
	public Driver(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
	
	public Driver()
	{
		System.out.println("Driver");
	}
	
	public void drive()
	{
		vehicle.drive();
	}
	
	// Getter
	public Driveable getVehicle()
	{
		return this.vehicle;
	}
	
	// Setter
	public void setVehicle(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
}

