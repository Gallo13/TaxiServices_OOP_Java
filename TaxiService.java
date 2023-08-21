package oop_driver_taxi;

public class TaxiService 
{
	public Ride process(Driver driver, Passenger[] passengers)
	{
		Ride ride = new Ride(driver, passengers);
		return ride;
	}
}
