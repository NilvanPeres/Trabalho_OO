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

    public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

    public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

    public double getincome() {
		return income;
	}

	public void setincome(double income) {
		this.income = income;
	}
	
    public void registerOfStudent() {
    	
    }
    
}
