
package entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
	
	
	public void recordStudent() {
			String resposta = "";
			
			Iterator<Student> it = students.iterator();
			while (it.hasNext()) {
				Student s = it.next();
				resposta += "nome =  " + s.getName() + " ; " + "email = " + s.getEmail() + " ; " +  "renda = " + s.getIncome() + "\n";
			}
			
			PrintWriter saida = null;
			try {
				saida = new PrintWriter(new FileWriter("alunos.txt", true));
				
				saida.print(resposta);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (saida != null)
					saida.close();
			}
			
	    }
	 
	
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
        	   
           while(linha != null);
        	
            
        } catch (Exception y) {
            System.out.println("erro");
        }
		   
			
	}
    
	public void lerArquivoDespesas () throws IOException {

		   try {
         FileInputStream arquivo = new FileInputStream("despesas_Dez_2020.txt");
         InputStreamReader input = new InputStreamReader(arquivo);
         BufferedReader br = new BufferedReader(input);
       
         String linha; 
        do {
     	   
     	   linha = br.readLine();
     	   if  (linha != null) {
     		   
     		 
     			   JOptionPane.showMessageDialog(null,"Estudante: \n" + linha);
     			
     			   }
	                
     			   
     		   }
     	   
        while(linha != null);
     	
         
     } catch (Exception y) {
         System.out.println("erro");
     }
		   
			
	}
 
	   
	   
	   public void CalculateByProportion() {
		   	Iterator<Student> itp = students.iterator();
	    	Iterator<Student> it = students.iterator();
	    	Iterator<Expense> itd = expenses.iterator();
	    	float rendaTotal = 0;
	    	float despesasSoma = 0; 
	    	double result = 0;
	    	
	    	
	    	while (itd.hasNext()) {
	    		Expense e = itd.next();
	    		despesasSoma += e.getAccount();
	    	}
	    	
	    	while (itp.hasNext()) {
	    		Student s = itp.next();
	    		rendaTotal += s.getIncome(); 
	    	}
	    	
	    	String msg ="";
	    	
	    	while(it.hasNext()) {
	    		Student s = it.next();
	    		result = (despesasSoma * s.getIncome()) / rendaTotal;
	    		msg += "Nome: " + s.getName() + " Pagar� " + result + "\n";
	    	}
	    	JOptionPane.showMessageDialog(null, msg);    	
	    }
	   
	   public void CalculateByEquality() {
	    	Iterator<Expense> itd = expenses.iterator();
	    	float despesasSoma = 0;
	    	
	    	int quantidadePessoas = students.size();
	    	
	    	while (itd.hasNext()) {
	    		Expense e = itd.next();
	    		despesasSoma += e.getAccount();
	    	}
	    	float div = despesasSoma / quantidadePessoas;
	    	
	    	String msg = "Cada pessoa pagar�:" + div +"\n";
	    	
	    	JOptionPane.showMessageDialog(null, msg);
	    }
	
	public boolean check_students() {
		Iterator<Student> it = students.iterator();
		if (it.hasNext() == false)
			return false;
		else
			return true;
	}
	
	public boolean check_expenses() {
		Iterator<Expense> it = expenses.iterator();
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