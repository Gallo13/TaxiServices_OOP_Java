public abstract class User {

	private String name;
	private String email;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
    
    @Override
    public int hashCode()
    {
        final int prime = 13;
        int result = 1;
        result = prime +((this.getName() == null) ? 0 : getName().hashCode());
        result = result + ((this.getEmail() == null) ? 0 : getEmail().hashCode());
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
        User other = (User)obj;
        if (getName() != null && other.getName() != null && getEmail() != null && other.getEmail() != null)
        {
            return getName().equals(other.getName()) && getEmail().equals(other.getEmail());
        }
        return false;  
    }
}