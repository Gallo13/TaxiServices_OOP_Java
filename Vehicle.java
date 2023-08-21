package oop_driver_taxi;

public class Vehicle implements Driveable
{
	private String year;
	private String make;
	private String model;
	private String plateNumber;
	private boolean inTransit;
	
	// Getter & Setter Year
    public String getYear()
    {
        return year;
    }
    
    public void setYear(String year)
    {
        this.year = year;
    }
    
    
    // Getter & Setter Make
    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }
    
    // Getter & Setter Model
    public String getModel()
    {
        return model;
    }
    
    public void setModel(String model)
    {
        this.model = model;
    }
    
    // Getter & Setter plateNumber
    public String getPlateNumber()
    {
        return plateNumber;
    }
    
    public void setPlateNumber(String plateNumber)
    {
        this.plateNumber = plateNumber;
    }
    
    // Getter & Setter boolean inTransit
    public boolean isInTransit() 
    {
		return this.inTransit;
	}

	public void setInTransit(boolean inTransit) 
    {
		this.inTransit = inTransit;
	}
    
    public void drive()
    {
        this.inTransit = true;
    }
}
