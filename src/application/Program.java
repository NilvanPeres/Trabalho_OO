/**
 /**
 * Trabalho de Orientacao a Objetos 
 * Feito por: 180097504 Ana Julia 
 *            190042419 Davi Matheus
 *            190046848 Lais Portela
 *            180125974 Lucas Rodrigues
 *            170122468 Nilvan Junior
 */
package application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import exceptions.DataInvalidaException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import entities.Expense;
import entities.Register;
import entities.Student;
import entities.SubCategory;
import exceptions.DataInvalidaException;
import exceptions.NoCategoryInExpenseException;
import exceptions.NoRegisterFoundException;
import exceptions.RendimentoInvalidoException;
import entities.Category;

public class Program {

	public static void main(String[] args) throws IOException {

		Register register = new Register();
		// menu
		System.out.println("Menu description: ");
		int opInt = 0;
		String opStr;
		
		do {
			opStr = JOptionPane.showInputDialog(null,
					"Choose an option. Or type 7 to EXIT: \n "
							+ " \n 1. Register Student. \n 2. Register Category. \n 3. Register Expense. "
							+ "\n 4. Calculate. \n 5. List Students. \n 6. List Expenses. \n 7. Exit.");

			try {
				opInt = Integer.parseInt(opStr);
			} catch (NumberFormatException e) {
				JOptionPane.showInputDialog(null,
						"INVALID INPUT !!! Choose an option. Or type 7 to QUIT: \n "
								+ "  \n 1. Register Student. \n 2. Register Category. \n 3. Register Expense. \n" + 
								" 4. Calculate. \n 5. List Students. \n 6. List Expenses. \n 7. Exit.");
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
							"Nï¿½o pode cadastrar renda negativa!!!\n\n" + " RendimentoInvalidoException ");
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
				register.recordStudent();
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
					break;
				}
				String[] quest = {"Essa categoria possui uma sub-categoria ?"};
				int a = JOptionPane.showConfirmDialog(null, 
						"Essa categoria possui uma sub-categoria ?",null, JOptionPane.YES_NO_OPTION);
				if (a == 0) {
					String NomeSubCategoria = JOptionPane.showInputDialog(null, "Digite nome da subcategoria: ");
					SubCategory sub = new SubCategory(NomeSubCategoria);
					register.add(sub);
					JOptionPane.showMessageDialog(null, "Cadastro de Sub-categoria Concluido com sucesso");
				} else {
				}
				break;
			
			case 3:
				String description = JOptionPane.showInputDialog(null, "Digite o nome da despesa");
				String valorDespesa = JOptionPane.showInputDialog(null, "Digite o valor da despesa");
				String DespesaCategory = JOptionPane.showInputDialog(null, "Digite a categoria da despesa");
				
				try {
					if (DespesaCategory.isEmpty())
						throw new NoCategoryInExpenseException();
				} catch (NoCategoryInExpenseException error) {
					JOptionPane.showMessageDialog(null,
							"Dados incompletos!! Por favor preencha todos os campos ");
					break;
				}
				
				try {
					if (valorDespesa.isEmpty())
						throw new RendimentoInvalidoException();
				} catch (RendimentoInvalidoException error) {
					JOptionPane.showMessageDialog(null,
							"Dados incompletos!! Por favor preencha todos os campos ");
					break;
				}
				Double valorDespesaInt = Double.valueOf(valorDespesa);	
				String monthString = JOptionPane.showInputDialog(null, "Digite o mes: ");
				Integer month = Integer.valueOf(monthString);
				try {
					if (month <= 0 || month > 12)
						throw new DataInvalidaException();
				} catch (DataInvalidaException error) {
					JOptionPane.showMessageDialog(null,
							"Mes Invalido !!!\n\n ");
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
				Expense e = new Expense(description, valorDespesaInt, month, year, DespesaCategory);
				try {
					if (valorDespesaInt < 0)
						throw new RendimentoInvalidoException();
				} catch (RendimentoInvalidoException error) {
					JOptionPane.showMessageDialog(null,
							"Nï¿½o pode cadastrar renda negativa!!!\n\n" + " RendimentoInvalidoException ");
					break;
				}
				try {
					if (description.isEmpty()) {
						throw new NoRegisterFoundException("Descricao em branco");
					}
					register.add(e);
					JOptionPane.showMessageDialog(null, "Cadastro de despesa Concluido com sucesso");
				} catch (Exception d) {
					JOptionPane.showMessageDialog(null, "Dados incompletos!! Por favor preencha todos os campos.");
				}
				e.despesaTxt(month, year);
				break;
			
			case 4:
				String[] options = {"CalculateByProportion", "CalculateIguality"};
				int x = JOptionPane.showOptionDialog(null, "Choose an option", "",
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

				if (x == 0) {
					//Primeiro tem q checar sem tem alunos e despesas cadastrados para realizar a divisão de despesas.

					//Caso tenham, perguntar o mês e o ano para o cálculo desejado
					JTextField xField = new JTextField(5);
					JTextField yField = new JTextField(5);

					JPanel myPanel = new JPanel();
					myPanel.add(new JLabel("Type Year: "));
					myPanel.add(xField);
					myPanel.add(Box.createHorizontalStrut(15)); // a spacer
					myPanel.add(new JLabel("Type Month: "));
					myPanel.add(yField);

					int result = JOptionPane.showConfirmDialog(null, myPanel,
							"Type year and month that will be calculated", JOptionPane.OK_CANCEL_OPTION);
					if (result == JOptionPane.OK_OPTION) {
						System.out.println("Ano: " + xField.getText());
						System.out.println("Mes: " + yField.getText());
						register.CalculateByProportion();
					}
					//checar se existem esse mês e ano cadastrados (ano guardado em = xField e mês em yField)
					

				} else {
					
					register.CalculateByEquality();
				}
				break;
			
			case 5: 
				JOptionPane.showMessageDialog(null, ": \n");
				register.lerArquivoAlunos();
				

				
				break;

				case 6:
					JOptionPane.showMessageDialog(null, "Despesas cadastradas no mês atual: \n");
					
					register.lerArquivoDespesas ();
			}
			

		} while (opInt != 7);
		System.out.println("saindo do menu");
		register.getStudents().forEach(s -> System.out.println(s));
		register.getCategories().forEach(c -> System.out.println(c));
		register.getExpenses().forEach(e -> System.out.println(e));
		register.getSubCategories().forEach(sub -> System.out.println(sub));

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
		 * -------------------------------Sugestï¿½o para implementar uma interface
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