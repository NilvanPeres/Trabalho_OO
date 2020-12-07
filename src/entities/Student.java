package entities;

public class Student {
	   
	private String name;
    private String email;
    private double income;
    
    public Student(String name, String email, double income) {
		this.name = name;
		this.email = email;
		this.income = income;
	}

    
	
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



	public double getIncome() {
		return income;
	}


	public void calculeIncome(double income) {
    	this.income += income;
    }
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		long temp;
		temp = Double.doubleToLongBits(income);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (Double.doubleToLongBits(income) != Double.doubleToLongBits(other.income))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	public String toString2(){
		return "Name: "
		+ name
		+ "Email: "
		+ email
		+ "Income: "
		+ income;
		
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", income=" + income + "]";
	}
}