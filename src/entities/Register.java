
package entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import javax.swing.JOptionPane;

public class Register {

	private List<Category> categories; // new ArrayList<Category>();
	private List<Student> students;
	private List<Expense> expenses;
	private List<SubCategory> SubCategories;
	private String mes;
	private int month;
	private int year;

	public Register() {
		this.students = new ArrayList<Student>(); // array list de estudantes
		this.categories = new ArrayList<Category>(); // array list de categoria
		this.expenses = new ArrayList<Expense>();
		this.SubCategories = new ArrayList<SubCategory>();
	}

	public void add(Student s) { // Metodo para adicionar estudante
		this.students.add(s);
	}

	// Metodo para lerArquivo e lancar excessao caso nao ache o arquivo.
	public void lerArquivoAlunos () throws IOException {

		try {
			FileInputStream arquivo = new FileInputStream("alunos.txt");
			InputStreamReader input = new InputStreamReader(arquivo);
			BufferedReader br = new BufferedReader(input);

			String linha; 
			do {
				linha = br.readLine();
				if  (linha != null) {
					JOptionPane.showMessageDialog(null,"Estudante: \n" + linha);
				}
			}
			while(linha != null);{
			}
			br.close();
		} catch (Exception y) {
			System.out.println("erro");
		}
	}
	//Metodo para ler Arquivo Despesas
	public void lerArquivoDespesas (int month, int year) throws IOException {
		this.month = month;
		this.year = year;

		if(month == 1 ){
			this.mes = "Jan";
		}
		else if (month == 2 ) {
			this.mes = "Fev";
		}
		else if (month == 3 ) {
			this.mes = "Mar";
		}
		else if (month == 4 ) {
			this.mes = "Abr";
		}
		else if (month == 5 ) {
			this.mes = "Mai";
		}
		else if (month == 6 ) {
			this.mes = "Jun";
		}
		else if (month == 7 ) {
			this.mes = "Jul";
		}
		else if (month == 8) {
			this.mes = "Ago";
		}
		else if (month == 9 ) {
			this.mes = "Set";
		}
		else if (month == 10) {
			this.mes = "Out";
		}
		else if (month == 11) {
			this.mes = "Nov";
		}
		else if (month == 12) {
			this.mes = "Dez";
		}
		String FileName = "despesas_"+mes+"_"+year+".txt";
		List<String> records = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FileName));
			String line; 
			do {
				line = reader.readLine();
				if  (line != null) {
					JOptionPane.showMessageDialog(null,"Despesas: \n" + line);
					records.add(line);
				}
			}
			while(line  != null);{
			}
			reader.close();
		} catch (Exception ex) {
			System.err.format("Exception occurred trying to read '%s'.", FileName);
			ex.printStackTrace();
		}
	}
	//calcular por propor��o
	public void CalculateByProportion() {

		String message ="";
		double totalIncome = 0;
		double totalExpense = 0; 
		double result = 0;
		Iterator<Student> studentAr = students.iterator();
		Iterator<Student> studentH = students.iterator();
		Iterator<Expense> itd = expenses.iterator();

		while (itd.hasNext()) {
			Expense e = itd.next();
			totalExpense += e.getAccount();
		}

		while (studentAr.hasNext()) {
			Student s = studentAr.next();
			totalIncome += s.getIncome(); 
		}

		while(studentH.hasNext()) {
			Student s = studentH.next();
			result = (totalExpense * s.getIncome()) / totalIncome;
			message += "Name: " + s.getName() + " will pay " + result + " R$" + "\n";
		}
		JOptionPane.showMessageDialog(null, message);    	
	}
	//Calcular por equality
	public void CalculateByEquality() {
		double totalExpense = 0;
		int totalStudents = students.size();
		Iterator<Expense> itd = expenses.iterator();
		while (itd.hasNext()) {
			Expense e = itd.next();
			totalExpense += e.getAccount();
		}
		double result = totalExpense / totalStudents;
		String message = "Cada pessoa pagara:" + result + "R$" + "\n";
		JOptionPane.showMessageDialog(null, message);
	}


	// Metodo para checar se o user ja cadastrado
	public boolean check_students() {
		Iterator<Student> it = students.iterator();
		if (it.hasNext() == false)
			return false;
		else
			return true;
	}

	// M�todo para checar se j� existe a Expense cadastrada
	public boolean check_expenses() {
		Iterator<Expense> it = expenses.iterator();
		if (it.hasNext() == false)
			return false;
		else
			return true;
	}

	//getters e setters
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