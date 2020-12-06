package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Category;
import entities.Expense;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		List<Expense> expenses = new ArrayList<>();
		Expense despesa = new Expense();
		Category category = new Category();
		despesa.setCategory(categoria);
		despesa.setDescription("Fatura Caesb");
		despesa.setYear(2020);
		despesa.setMonth(12);
		
		List<Expense> expenseNovembro2020 = new ArrayList<>();
		
		for(Expense e : expenses){
			if(e.getMonth() == 11 && e.getYear() == 2020){
				expenseNovembro2020.add(despesa);
			}
		}
		
		double custoNovembro2020 = 0.0;
		expenseNovembro2020.forEach(e -> custoNovembro2020 += e.getExpense());
		
		int soma;
	
		/* -------------------------------Sugestão para implementar uma interface simples-------------------------------
		
		String one = JOptionPane.showInputDialog("Digite o nome da categoria a criar: ");
		String i = input.nextLine();
		category.setCategoryName (i);
				
		
		//String two = JOptionPane.showInputDialog("Digite o valor da categoria: ");
		//int segundoNum = Integer.parseInt(two);			
		//soma = primeiroNum + segundoNum;
			
	
		JOptionPane.showMessageDialog(null,t);
			
		input.close(); 
		*/
		
	}
}
