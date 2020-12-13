
package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Register {

	private List<Category> categories; // new ArrayList<Category>();
	private List<Student> students;
	private List<Expense> expenses;
	private List<SubCategory> SubCategories;

	public Register() {
		this.students = new ArrayList<Student>(); // array list de estudantes
		this.categories = new ArrayList<Category>(); // array list de categoria
		this.expenses = new ArrayList<Expense>();
		this.SubCategories = new ArrayList<SubCategory>();
	}

	public void add(Student s) { // Metodo para adicionar estudante
		this.students.add(s);
	}

	public boolean check_students() {
		Iterator<Student> it = students.iterator();
		if (it.hasNext() == false)
			return false;
		else
			return true;
	}

	public List<Category> getCategories() { // get da lista de categoria
		return categories;
	}

	public List<SubCategory> getSubCategories() { // get da lista de categoria
		return SubCategories;
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

	public boolean check_expenses() {
		Iterator<Expense> it = expenses.iterator();
		if (it.hasNext() == false)
			return false;
		else
			return true;
	}

	public void add(SubCategory sub) { // adiciona despesa
		this.SubCategories.add(sub);
	}

	public Double calculateIncomes() { // calcula a renda mensal dos estudantes
		Double total = 0.0;
		for (Student s : students) {
			total += s.getIncome();

		}
		return total;
	}

	public Double calculateExpenses() { // calcula a renda mensal dos estudantes
		Double totalExpenses = 0.0;
		for (Expense e : expenses) {
			totalExpenses += e.getAccount();

		}
		return totalExpenses;
	}

	public void removeStudent(Student student) { // remove estudante
		this.students.remove(student);
	}

	public Double calculateByProportion(Student calculeIncomes, Double income) {
		return (income / calculateIncomes()) * 100;
	}

	public Double calculateEquility(List<Student> students, List<Expense> expenses) {
		return calculateExpenses() / students.size();
	}

}