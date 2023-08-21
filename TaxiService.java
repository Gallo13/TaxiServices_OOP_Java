package oop_driver_taxi;

public class TaxiService 
{
	public void validate(Ride ride) throws InvalidRideException
	{
		if(ride.getDriver() == null || ride.getPassengers() == null)
		{
			throw new InvalidRideException();
		}
		if(ride.getPassengers().length > 4 || ride.getPassengers().length < 1)
		{
			throw new InvalidRideException();
		}
	}
	
	public int business(Ride ride)
	{
		int count = 0;
		Passenger[] passengers = ride.getPassengers();
		
		for(Passenger passenger : passengers)
		{
			if(passenger.getAccountType()=="BUSINESS")
			{
				count++;
			}
		}
		return count;
	}
	
	public Ride process(Driver driver, Passenger[] passengers)
	{
		Ride ride = new Ride(driver, passengers);
		return ride;
	}
}
