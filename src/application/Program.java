package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Expense;
import entities.Register;
import entities.Student;
import entities.Category;

public class Program {

	public static void main(String[] args) {
		
		Register register = new Register();


		// menu

		System.out.println("Menu description: ");

		int opInt = 0;
		String opStr;

		do {
			opStr = JOptionPane.showInputDialog(null,
					"Selecione a opcao desejada. Ou digite 4 para sair do programa: \n "
							+ " \n 1. Register Student. \n 2. Register Category . \n 3. Register Despesa. \n 4. Exit.");

			// Caso a entrada nao seja um inteiro
			try {
				opInt = Integer.parseInt(opStr);
			} catch (NumberFormatException e) {
				JOptionPane.showInputDialog(null,
						"ENTRADA INVALIDA !!! \n Selecione a opcao desejada. Ou digite 4 para sair do programa: \n "
								+ " \n 1. Register Student. \n 2. Register Category . \n 3. Register Despesa. \n 4. Exit.");
				opInt = 0;
			}

			switch (opInt) {
			case 1:
				String nomeEstudante = JOptionPane.showInputDialog(null, "Digite seu nome: ");
				String emailEstudante = JOptionPane.showInputDialog(null, "Digite seu e-mail: ");
				String renda = JOptionPane.showInputDialog(null, "Digite sua renda: ");
				Double income = Double.valueOf(renda);
				Student s = new Student(nomeEstudante, nomeEstudante, income);
				register.add(s);
				break;

			case 2:
				String nomeCategoria = JOptionPane.showInputDialog(null, "Digite o nome da categoria: ");
				Category c = new Category(nomeCategoria);
				register.add(c);
				break;

			case 3:
				String nomeDespesa = JOptionPane.showInputDialog(null, "Digite o nome da despesa");
				String valorDespesa = JOptionPane.showInputDialog(null, "Digite o valor da despesa");
				Integer valorDespesaInt = Integer.parseInt(valorDespesa);
				Expense e = new Expense(nomeDespesa, valorDespesaInt);
				register.add(e);
				break;

			}

		} while (opInt != 4);
		System.out.println("saindo do menu");
		register.getStudents().forEach(s -> System.out.println(s));
		register.getCategories().forEach(c -> System.out.println(c));


		
		//register.removeStudent(student);

		// List<Expense> expenses = new ArrayList<>();
		// Expense despesa = new Expense();
		// Category category = new Category();
		// despesa.setCategory(categoria);
		// despesa.setDescription("Fatura Caesb");
		// despesa.setYear(2020);
		// despesa.setMonth(12);

		List<Expense> expenseNovembro2020 = new ArrayList<>();

		// for(Expense e : expenses){
		// if(e.getMonth() == 11 && e.getYear() == 2020){
		// expenseNovembro2020.add(despesa);
		// }
		// }

		double custoNovembro2020 = 0.0;
		// expenseNovembro2020.forEach(e -> custoNovembro2020 += e.getExpense());

		int soma;
		

		/*
		 * -------------------------------Sugestão para implementar uma interface
		 * simples-------------------------------
		 * 
		 * String one =
		 * JOptionPane.showInputDialog("Digite o nome da categoria a criar: "); String i
		 * = input.nextLine(); category.setCategoryName (i);
		 * 
		 * 
		 * //String two = JOptionPane.showInputDialog("Digite o valor da categoria: ");
		 * //int segundoNum = Integer.parseInt(two); //soma = primeiroNum + segundoNum;
		 * 
		 * 
		 * JOptionPane.showMessageDialog(null,t);
		 * 
		 * input.close();
		 */
	}
}