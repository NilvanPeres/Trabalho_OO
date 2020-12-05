package entities;

import java.util.List;

public class Category {
	
	private String categoryName;
	private String categoryRegister;
	private List<Expense> expenses;
	
	public void registerOfExpense(){
		
	}
	
	public void removeExpense(){
		
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryRegister() {
		return categoryRegister;
	}

	public void setCategoryRegister(String categoryRegister) {
		this.categoryRegister = categoryRegister;
	}

	public List<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}
	

}
