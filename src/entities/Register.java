
package entities;

import java.util.ArrayList;
import java.util.List;

public class Register  {

	private List<Category> categories; // new ArrayList<Category>();
	private List<Student> students;
	private List<Expense> expenses;

	public Register() {
		this.students = new ArrayList<Student>(); // array list de estudantes
		this.categories = new ArrayList<Category>(); // array list de categoria
		this.expenses = new ArrayList<Expense>();
	}

	public void add(Student s) { // Metodo para adicionar estudante
		this.students.add(s);
	}

	public List<Category> getCategories() { // get da lista de categoria
		return categories;
	}

	public List<Student> getStudents() { // get da lista de estudantes
		return students;
	}

	public List<Expense> getExpenses() { // get da lista de despesa
		return expenses;
	}

	public void add(Category c) { // adiciona categoria
		this.categories.add(c);
	}

	public void add(Expense e) { // adiciona despesa
		this.expenses.add(e);
	}

	public Double calculateIncomes() { // calcula a renda mensal dos estudantes
		Double total = 0.0;
		for (Student s : students) {
			total += s.getIncome();

		}
		return total;
	}

	public void removeStudent(Student student) { // remove estudante
		this.students.remove(student);
	}

	public Double calculateByProportion(Student calculeIncomes, Double income) {
		return (income / calculateIncomes()) * 100;
	}

	public Double calculate(Double income, Double account) {
		return income - account;
	}

	// Polimorfismo
	@Override
	public String toString() {
		return  "Categories: " 
		+ categories 
		+ "Students: "
		+ students
		+ "Expenses: "
		+ expenses ;
	}

	

}