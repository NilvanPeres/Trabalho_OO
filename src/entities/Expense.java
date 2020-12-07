package entities;

public class Expense { 
	private double account;
    private int month;
    private int year;
    private String description;
   
    
    public Expense(String description, double account, int month, int year) {
    	this.description = description;
    	this.account = account;
    	this.month = month;
    	this.year = year; 	
	}

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void addExpense(double account) {
		this.account += account;
	}
	
	public void removeExpense(double account) {
		this.account -= account;
	}
    
<<<<<<< HEAD
	public double calculeExpense(){ //calcula a renda mensal dos estudantes	
=======
	public Double calculeExpense(){ //calcula a renda mensal dos estudantes	
>>>>>>> fe9363254e7dc8ce7e8cf8bc4344116d5f0472e6
	return month * account;
	}
}