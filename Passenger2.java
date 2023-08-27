public class Passenger extends User {
	
	// BUSINESS, PERSONAL, etc.
	private String accountType;

	public Passenger() {
		super();
	}

    // Do not delete this constructor.
	public Passenger(String name, String accountType) {
		super();
		this.setName(name);
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
    
    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Passenger other = (Passenger)obj;
        if (getAccountType() !=null && other.getAccountType() != null)
        {
            return getAccountType().equals(other.getAccountType());
        }
        return false;  
    }
}
