import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import exceptions.CategoriaNaoEncontradaException;
import exceptions.DespesaSemCategoriaException;

public class Register {

	private List<Category> categories; // new ArrayList<Category>();
	private List<Student> students;
	
	
	public Register() {
		this.students = new ArrayList <>();
		this.categories = new ArrayList <>();
	}
	
	public void registerStudent(Student s) {
		students.add(s);
	}
	
	public boolean removeStudent(String name){
		int  list = 0;
		boolean found = false;
		for(int i = 0; i < students.size(); i ++) {
			if(students.get(i).getName().equals(name)) {
				list = i;
				found = true;
				
			}}
		}
	
	public boolean validateName(JTextField name) {
		String name;
		name = keyboard.nextLine();
		if (!name.matches("[a-zA-Z_]+")) {
			JOptionPane.showMessageDialog(null, "Invalid name! Digite apenas letras para os n�meros");
			
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
            throw new DespesaSemCategoriaException("Voc� precisa adicionar uma Categoria antes!");
        } 
        
        else if(!found) {
            throw new CategoriaNaoEncontradaException("N�o tem nenhuma categoria com essse nome!");
        }
        
        else {
            categorias.get(i).cadastrarDespesa(d);
        }
    		
    }
    	
    
    
    
    
	

	public Double calculeIncomes(List<Student> students){ //calcula a renda mensal dos estudantes
		Double total = 0.0;
		students.forEach( Student -> total += Student.getincome());

		return total;
	}

	public Double getCostByCategoryName(String categoryName){
		Double total = 0.0;
		Optional<Category> finded = categories
									.stream()
									.filter( category -> categoryName.equalsIgnoreCase(category.getCategoryName())).findFirst();
		if(finded.isPresent()){
			finded.get().getExpenses().forEach( expense -> total += expense.getexpense());
		}

		return total;
	}
	public void ReportStudent() {
		int size = students.size(){
			System.out.println(students.get(i).getName);
		}
	}

}