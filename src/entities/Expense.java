package entities;

public class Expense { 
	
	// Atributos
	private double account;     //valor da conta
    private int month;          // mes
    private int year;	        // ano
    private String description; //descricao da despesa
   
    // Construtor
    public Expense(String description, double account, int month, int year) {
    	this.description = description;
    	this.account = account;
    	this.month = month;
    	this.year = year; 	
	}

	
	public Expense(String description2, Double valorDespesaInt) {
		// TODO Auto-generated constructor stub
	}


	//Metodos gets e sets
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
	
	// Metodos da lista
	public void addExpense(double account) { // adiciona despesa
		this.account += account;
	}
	
	public void removeExpense(double account) { //remove despesa
		this.account -= account;
	}
	
	
	
	@Override //polimorfismo
	public String toString() {
		return "Expense [Nome Despesa=" + description + ", Valor=" + account + "]";
	}
	
	public double calculeExpense(){ //calcula a renda mensal dos estudantes	
		return month * account;
		}
}