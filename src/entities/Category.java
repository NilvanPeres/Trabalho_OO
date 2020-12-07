package entities;

import java.util.List;

public class Category {
	
	private String categoryName;
	private String categoryRegister;
	private List<Expense> expenses; //lista despesa
	
	

	public Category(String categoryName, String categoryRegister) {
		this.categoryName = categoryName;
		this.categoryRegister = categoryRegister;
	}

	public Category (String categoryName) { //metodo construtor vazio
		this.categoryName = categoryName;
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
	
	//metodos
	public void registerOfExpense(Expense e){
		expenses.add(e);
		
	}
	
	public void removeExpense(Expense e){ //qualquer coisa mudar pra int index
		expenses.remove(e);
	}
	
	
	@Override //polimorfismo
    public String toString() {
        return "Categoria [nome=" + categoryName + ", registro=" + categoryRegister + "]";
    }
}