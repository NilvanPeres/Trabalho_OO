package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Register {

	private List<Category> categories; // new ArrayList<Category>();
	private List<Student> students;
	int i;
	
	
	public Register() {
		this.students = new ArrayList <>();
		this.categories = new ArrayList <>();
	}
	
	public void registerStudent(Student s) {
		students.add(s);
	}
	
	public int getNumberStudents(){
		return students.size();
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
			
		if(found) {
			students.remove(list);
			return true;
		}else {
			return false;
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
		int size = students.size();{
		for(int i =0; i < size; i ++) {
			System.out.println(students.get(i).getName());
		}
	}
	}
}


