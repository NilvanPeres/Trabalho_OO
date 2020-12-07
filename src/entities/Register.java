package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import exceptions.NoCategoryFoundException;
import exceptions.NoCategoryInExpenseException;

public class Register {

	private List<Category> categories; // new ArrayList<Category>();
	private List<Student> students;
	private List<Expense> expenses;

	
	
	public Register() {
		this.students = new ArrayList <>();
		this.categories = new ArrayList <>();
		this.expenses = new ArrayList<Expense>();
	}
	
	
	
	/* public void registerStudent(Student s) {
		students.add(s);
	}
	
	public boolean removeStudent(String name){
		int  list = 0;
		boolean found = false;
		for(int i = 0; i < students.size(); i ++) {
			if(students.get(i).getName().equals(name)) {
				list = i;
				found = true;
				
			}
			}
		if(found){
			students.remove(list);
            return true;
        } else {
            return false;
        }
    }
			
		
	public int getNumberStudents(){
		return students.size();
	}
	
	public void registerCategory(Category c) {
		categories.add(c);
	}
	
	public int getsizeCategory(){
		return categories.size();
	}
	
    public boolean removeCategoria(String categoryName) {
        int list = 0;
        boolean found = false;
        for(int i = 0; i < categories.size(); i++) {
            if(categories.get(i).getCategoryName().equals(categoryName)) {
                list = i;
                found = true;
            }
        }
        
        if(found) {
            categories.remove(list);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean categoriesIsEmpty() {
        return categories.isEmpty();
    }
    
    public void registerExpense(String categoryName, Expense e) {
    	int list = 0;
    	boolean found = false;
    	for (int i = 0; i<categories.size(); i++) {
    		if (categories.get(i).getCategoryName().equals(categoryName)) {
    			list = i;
    			found = true;
    		}
    	}
        
        if(categories.isEmpty()) {
            throw new NoCategoryInExpenseException("Voc� precisa adicionar uma Categoria antes!");
        } 
        
        else if(!found) {
            throw new NoCategoryFoundException("N�o tem nenhuma categoria com essse nome!");
        }
        
        else {
            categories.get(i).registerOfExpense(e);
        }
    		
    }
    */
	
	public void add(Student s) {
		this.students.add(s);
	}
	
	public List<Category> getCategories() {
		return categories;
	}



	public List<Student> getStudents() {
		return students;
	}



	public List<Expense> getExpenses() {
		return expenses;
	}



	public void add(Category c) {
		this.categories.add(c);
	}
	
	public void add(Expense e) {
		this.expenses.add(e);
	}
	
    public Double calculateIncomes(){ //calcula a renda mensal dos estudantes
		Double total = 0.0;
		for(Student s : students) {
			total += s.getIncome();
		}

		return total;
	}
    
    public void removeStudent(Student student) {
    	this.students.remove(student);
    }

	@Override
	public String toString() {
		return "Register [categories=" + categories + ", students=" + students + "]";
	}
    
    

	/* public void ReportStudent() {
		int size = students.size();{
			  for(int i = 0; i < size; i++) {
			System.out.println(students.get(i).getName());
		}
	} */
    
    

}
