package entities;

public class Category {
	
	private String categoryName;
	private String categoryRegister;
	
	public Category(String categoryName, String categoryRegister) {
		this.categoryName = categoryName;
		this.categoryRegister = categoryRegister;
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
	
	
	public void registerOfExpense(){
		
	}
	
	public void removeExpense(){
		
	}
	

}
