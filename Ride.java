package oop_driver_taxi;

public class Ride 
{
	private Driver driver;
	private Passenger[] passengers;
	private boolean completed;
	
	public Ride()
	{
		super();
	}
	
	public Ride(Driver driver, Passenger[] passengers)
	{
		this.driver = driver;
		this.passengers = passengers;
	}
	
	public Driver getDriver()
	{
		return driver;
	}
	
	public void setDriver(Driver driver)
	{
		this.driver = driver;
	}
	
	public Passenger[] getPassengers()
	{
		return passengers;
	}
	
	public void setPassengers(Passenger[] passengers)
	{
		this.passengers = passengers;
	}
	
	public boolean isCompleted()
	{
		return completed;
	}
	
	public void setComplete(boolean completed)
	{
		this.completed = completed;
	}
}
