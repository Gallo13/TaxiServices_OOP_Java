import java.util.List;
import java.util.ArrayList;

public class TaxiService {

	/**
	 * Assemble the Vehicles into a list. Be sure the order of the Vehicles remain:
	 * one, two, three.
	 * 
	 * @param one
	 * @param two
	 * @param three
	 * @return
	 */
	public List<Vehicle> list(Vehicle one, Vehicle two, Vehicle three) {
		List<Vehicle> list = new ArrayList<Vehicle>();
        if(one != null) list.add(one);
        if(two != null) list.add(two);
        if(three != null) list.add(three);
        return list;
	}

	/**
	 * Ride cannot have more than 4 passengers. Ride must have a driver and at least
	 * 1 passenger.
	 * 
	 * If the Ride is not valid, throw the InvalidRideException.
	 * 
	 * @param ride
	 * @return
	 */
	public void validate(Ride ride) throws InvalidRideException {
		if(ride !=null && ride.getDriver() != null && ride.getPassengers() != null)
        {
            int qty = ride.getPassengers().size();
            if(qty >4 || qty < 1)
                throw new InvalidRideException();
        }
        else throw new InvalidRideException();
	}

}
