package entities;

import java.util.List;

public class Category {
	
	private String categoryName; // string para definir nome da categoria
	private String categoryRegister; // string para registrar a categoria
	private List<Expense> expenses; // lista despesa
	
	
	//Construtor 
	public Category (String categoryName) { 
		this.categoryName = categoryName;
	}
	
	//Metodos gets e sets
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	

	public void setCategoryRegister(String categoryRegister) {
		this.categoryRegister = categoryRegister;
	}

	public List<Expense> getExpenses() { // get da lista de despesas
		return expenses;
	}

	public void setExpenses(List<Expense> expenses) { // set da lista de despesas
		this.expenses = expenses;
	}
	
	//Metodos
	public void registerOfExpense(Expense e){ // para registrar despesa
		expenses.add(e);
		
	}
	
	public void removeExpense(Expense e){ // para remover despesa
		expenses.remove(e);
	}
	

	public String getCategoryRegister() {
		return categoryRegister;
		
	}
	
	@Override
	public String toString() {
		return "Category: "
		+ categoryName;	
	}

}