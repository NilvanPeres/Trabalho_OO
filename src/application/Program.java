/**
 * Trabalho de Orientacao a Objetos 
 * Feito por: Ana Julia 
 *            Davi Matheus
 *            Lais Portela
 *            Lucas Rodrigues
 *            Nilvan Junior
 */
package application;

import javax.swing.JOptionPane;

import entities.Category;
import entities.Expense;
import entities.Register;
import entities.Student;
import entities.SubCategory;
import exceptions.NoRegisterFoundException;
import exceptions.RendimentoInvalidoException;

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
				Student student = new Student(nomeEstudante, emailEstudante, income);
				System.out.println(student.toString());
				try {
					if (income < 0)
						throw new RendimentoInvalidoException();
				} catch (RendimentoInvalidoException error) {
					JOptionPane.showMessageDialog(null,
							"Nao pode cadastrar renda negativa!!!\n\n" + " RendimentoInvalidoException ");
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
				String subCategoria = JOptionPane.showInputDialog(null, "Digite o nome da categoria: ");
				Category c = new Category(nomeCategoria);
				SubCategory sub = new SubCategory(subCategoria);
				System.out.println(sub.toString());
				
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
				Double valorDespesaInt = Double.valueOf(valorDespesa);
				
				String monthString = JOptionPane.showInputDialog(null, "Digite o mes: ");
				Integer month = Integer.valueOf(monthString);
				String yearSring = JOptionPane.showInputDialog(null, "Digite o ano: ");
				Integer year = Integer.valueOf(yearSring);
				Expense e = new Expense(description, valorDespesaInt, month, year);
				System.out.println(e.toString());
				
				System.out.println(register.calculate(income, valorDespesaInt));
				
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

			}

		} while (opInt != 4);
		System.out.println("saindo do menu");

		register.getStudents().forEach(s -> System.out.println(s));
		register.getCategories().forEach(c -> System.out.println(c));
		register.getExpenses().forEach(e -> System.out.println(e));

	}
}