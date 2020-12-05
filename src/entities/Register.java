package entities;

import java.util.List;
import java.util.Optional;

public class Register {

	private List<Category> categories; // new ArrayList<Category>();
	private List<Student> students;

	public Double calculeIncomes(List<Student> students){ //calcula a renda mensal dos estudantes
		Double total = 0.0;
		students.forEach( student -> total += student.getIncome());

		return total;
	}

	public Double getCostByCategoryName(String categoryName){
		Double total = 0.0;
		Optional<Category> finded = categories
									.stream()
									.filter( category -> categoryName.equalsIgnoreCase(category.getCategoryName())).findFirst();
		if(finded.isPresent()){
			finded.get().getExpenses().forEach( expense -> total += expense.getExpense());
		}

		return total;
	}



}
