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
	
	public String toString(){
		return "Name: "
		+ name
		+ "Email: "
		+ email
		+ "Income: "
		+ income;
		
	}
    
}