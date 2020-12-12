/**
 * Trabalho de Orientacao a Objetos 
 * Feito por: Ana Julia 
 *            Davi Matheus
 *            Lais Portela
 *            Lucas Rodrigues
 *            Nilvan Junior
 */
package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Expense;
import entities.Register;
import entities.Student;
import exceptions.DataInvalidaException;
import exceptions.NoCategoryInExpenseException;
import exceptions.NoRegisterFoundException;
import exceptions.RendimentoInvalidoException;
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
				try {
					if (renda.isEmpty())
						throw new RendimentoInvalidoException();
				} catch (RendimentoInvalidoException error) {
					JOptionPane.showMessageDialog(null,
							"Dados incompletos!! Por favor preencha todos os campos ");
					break;
				}
				
				Double income = Double.valueOf(renda);
				
				
				try {
					if (income < 0)
						throw new RendimentoInvalidoException();
				} catch (RendimentoInvalidoException error) {
					JOptionPane.showMessageDialog(null,
							"Não pode cadastrar renda negativa!!!\n\n" + " RendimentoInvalidoException ");
					break;
				}

				Student s = new Student(nomeEstudante, emailEstudante, income);
				
				try {
					if (nomeEstudante.isEmpty() || emailEstudante.isEmpty() || renda.isEmpty()) {
						throw new NoRegisterFoundException("Dados incompletos!! Por favor preencha todos os campos");

					}
					
					register.add(s);
					JOptionPane.showMessageDialog(null, "Cadastro de Estudante Concluido com sucesso");

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Dados incompletos!! Por favor preencha todos os campos.");
					break;
				}
				s.alunoTxt();

				break;

			case 2:
				String nomeCategoria = JOptionPane.showInputDialog(null, "Digite o nome da categoria: ");
				Category c = new Category(nomeCategoria);

				try {
					if (nomeCategoria.isEmpty()) {
						throw new NoRegisterFoundException("Dados incompletos!! Preencha o campo.");

					}
					
					register.add(c);
					JOptionPane.showMessageDialog(null, "Cadastro de Categoria Concluido com sucesso");

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Dados incompletos!! Por favor preencha todos os campos.");
				}

				break;
			case 3:

				String description = JOptionPane.showInputDialog(null, "Digite o nome da despesa");
				
				String valorDespesa = JOptionPane.showInputDialog(null, "Digite o valor da despesa");
				
				try {
					if (valorDespesa.isEmpty())
						throw new RendimentoInvalidoException();
				} catch (RendimentoInvalidoException error) {
					JOptionPane.showMessageDialog(null,
							"Dados incompletos!! Por favor preencha todos os campos ");
					break;
				}
				
		    
		        Double valorDespesaInt = Double.valueOf(valorDespesa);	

				String monthString = JOptionPane.showInputDialog(null, "Digite o mês: ");
				Integer month = Integer.valueOf(monthString);
				try {
					if (month <= 0 || month > 12)
						throw new DataInvalidaException();
				} catch (DataInvalidaException error) {
					JOptionPane.showMessageDialog(null,
							"Mês Invalido !!!\n\n ");
					break;
				}
				
				String yearSring = JOptionPane.showInputDialog(null, "Digite o ano: ");
				try {
					 if (yearSring.length() != 4)
						 throw new DataInvalidaException();
				} catch (DataInvalidaException error) {
					JOptionPane.showMessageDialog(null,
							"Ano Invalido !!!\n\n ");
					break;
				}
						 
				
				Integer year = Integer.valueOf(yearSring);
				
				
				Expense e = new Expense(description, valorDespesaInt, month, year);
				
				try {
					if (valorDespesaInt < 0)
						throw new RendimentoInvalidoException();
				} catch (RendimentoInvalidoException error) {
					JOptionPane.showMessageDialog(null,
							"Não pode cadastrar renda negativa!!!\n\n" + " RendimentoInvalidoException ");
					break;
				}
				
				try {
					if (description.isEmpty()) {
						throw new NoRegisterFoundException("Descrição em branco");
					}
					
					register.add(e);
					JOptionPane.showMessageDialog(null, "Cadastro de despesa Concluido com sucesso");

				} catch (Exception d) {
					JOptionPane.showMessageDialog(null, "Dados incompletos!! Por favor preencha todos os campos.");

				}
				e.despesaTxt(month, year);
				break;

			}

		} while (opInt != 4);
		System.out.println("saindo do menu");

		register.getStudents().forEach(s -> System.out.println(s));
		register.getCategories().forEach(c -> System.out.println(c));
		register.getExpenses().forEach(e -> System.out.println(e));

		// register.removeStudent(student);

		// List<Expense> expenses = new ArrayList<>();
		// Expense despesa = new Expense();
		// Category category = new Category();
		// despesa.setCategory(categoria);
		// despesa.setDescription("Fatura Caesb");
		// despesa.setYear(2020);
		// despesa.setMonth(12);

		/*
		 * List<Expense> expenseNovembro2020 = new ArrayList<>();
		 * 
		 * // for(Expense e : expenses){ // if(e.getMonth() == 11 && e.getYear() ==
		 * 2020){ // expenseNovembro2020.add(despesa); // } // }
		 * 
		 * double custoNovembro2020 = 0.0; // expenseNovembro2020.forEach(e ->
		 * custoNovembro2020 += e.getExpense());
		 * 
		 * int soma;
		 */

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