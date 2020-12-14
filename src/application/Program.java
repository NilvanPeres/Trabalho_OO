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
import java.io.IOException;
import javax.swing.JOptionPane;
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


			opInt = Integer.parseInt(opStr);

			switch (opInt) {
			case 1:

				String nomeEstudante = JOptionPane.showInputDialog(null, "Type your name: ");
				String emailEstudante = JOptionPane.showInputDialog(null, "Typer your e-mail: ");
				String renda = JOptionPane.showInputDialog(null, "Type your income: ");
				
				//Se income(renda) estiver vazia lanca excessao de dados incompletos.
				try {
					if (renda.isEmpty())
						throw new RendimentoInvalidoException();
				} catch (RendimentoInvalidoException error) {
					JOptionPane.showMessageDialog(null,
							"Register incomplete!! Please type all information requested. ");
					break;
				}
				Double income = Double.valueOf(renda);
				
				// Se income(renda) for um valor negativo uma excessao lancada.
				try {
					if (income < 0)
						throw new RendimentoInvalidoException();
				} catch (RendimentoInvalidoException error) {
					JOptionPane.showMessageDialog(null,
							"You can't register negative incomes !!!\n\n" + " RendimentoInvalidoException ");
					break;
				}

				Student s = new Student(nomeEstudante, emailEstudante, income);
				
				// Se nome/e-mail/income forem nulos uma excessao sera lancada
				try {
					if (nomeEstudante.isEmpty() || emailEstudante.isEmpty() || renda.isEmpty()) {
						throw new NoRegisterFoundException("Register incomplete!! Please type all information requested.");
					}
					register.add(s);
					JOptionPane.showMessageDialog(null, "Your student registration was successful");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Register incomplete!! Please type all information requested.");
					break;
				}
				//register.recordStudent();
				s.alunoTxt();
				break;

			case 2:
				String nomeCategoria = JOptionPane.showInputDialog(null, "Type category: ");
				Category c = new Category(nomeCategoria);
				//Se categoria for nula uma excesscao e lancada
				try {
					if (nomeCategoria.isEmpty()) {
						throw new NoRegisterFoundException("Register incomplete!! Please type all information requested.");
					}
					register.add(c);
					JOptionPane.showMessageDialog(null, "Your category registration was successful");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Register incomplete!! Please type all information requested.");
					break;
				}
				String[] quest = {"This category has a subcategory ? "};
				int a = JOptionPane.showConfirmDialog(null, 
						"This category has a subcategory ?",null, JOptionPane.YES_NO_OPTION);
				if (a == 0) {
					String NomeSubCategoria = JOptionPane.showInputDialog(null, "Type name of subcategory: ");
					SubCategory sub = new SubCategory(NomeSubCategoria);
					register.add(sub);
					JOptionPane.showMessageDialog(null, "Your sub-category registration was successful");
				} else {
				}
				break;

			case 3:
				String description = JOptionPane.showInputDialog(null, "Type name of expense");
				String valorDespesa = JOptionPane.showInputDialog(null, "Type value of expense");
				String DespesaCategory = JOptionPane.showInputDialog(null, "Type the category of the expense");

				// se DespesaCategory for vazia uma excessao sera lancada
				try {
					if (DespesaCategory.isEmpty())
						throw new NoCategoryInExpenseException();
				} catch (NoCategoryInExpenseException error) {
					JOptionPane.showMessageDialog(null,
							"Register incomplete!! Please type all information requested.");
					break;
				}
				//Se despesa for null uma excessao sera lancada
				try {
					if (valorDespesa.isEmpty())
						throw new RendimentoInvalidoException();
				} catch (RendimentoInvalidoException error) {
					JOptionPane.showMessageDialog(null,
							"Register incomplete!! Please type all information requested.");
					break;
				}
				Double valorDespesaInt = Double.valueOf(valorDespesa);	
				String monthString = JOptionPane.showInputDialog(null, "Type month: ");
				Integer month = Integer.valueOf(monthString);
				try {
					if (month <= 0 || month > 12)
						throw new DataInvalidaException();
				} catch (DataInvalidaException error) {
					JOptionPane.showMessageDialog(null,
							"Invalid month !!!\n\n ");
					break;
				}
				String yearSring = JOptionPane.showInputDialog(null, "Type year: ");
				
				//Se o ano digitado nao possuir 4 caracteres uma excessao sera lancada
				try {
					if (yearSring.length() != 4)
						throw new DataInvalidaException();
				} catch (DataInvalidaException error) {
					JOptionPane.showMessageDialog(null,
							"Invalid Year !!!\n\n ");
					break;
				}
				Integer year = Integer.valueOf(yearSring);
				Expense e = new Expense(description, valorDespesaInt, month, year, DespesaCategory);
				
				//se o valor da despesa for negativo, uma excessao sera lancada
				try {
					if (valorDespesaInt < 0)
						throw new RendimentoInvalidoException();
				} catch (RendimentoInvalidoException error) {
					JOptionPane.showMessageDialog(null,
							"You can't register negative incomes !!!\\n\\n\" + \" RendimentoInvalidoException ");
					break;
				}
				// se a descricao for null uma excesscao sera lan�ada.
				try {
					if (description.isEmpty()) {
						throw new NoRegisterFoundException("Missing values");
					}
					register.add(e);
					JOptionPane.showMessageDialog(null, "Your expense registration was successful");
				} catch (Exception d) {
					JOptionPane.showMessageDialog(null, "Register incomplete!! Please type all information requested.");
				}
				e.despesaTxt(month, year);
				break;

			case 4:
				String[] options = {"CalculateByProportion", "CalculateIguality"};
				int x = JOptionPane.showOptionDialog(null, "Choose an option", "",
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

				if (x == 0) {
					//Primeiro tem q checar sem tem alunos e despesas cadastrados para realizar a divis�o de despesas.

					String monthS = JOptionPane.showInputDialog(null, "Type month: ");
					int monthInt = Integer.parseInt(monthS);
					String yearS = JOptionPane.showInputDialog(null, "Type year: ");
					int yearI = Integer.parseInt(yearS);
					register.CalculateByProportion();

					//checar se existem esse mes e ano cadastrados (ano guardado em = xField e m�s em yField)


				} else {

					register.CalculateByEquality();
				}
				break;

			case 5: 

				register.lerArquivoAlunos();

				break;

			case 6:
				String monthS = JOptionPane.showInputDialog(null, "Choose month registered: ");
				int monthInt = Integer.parseInt(monthS);
				
				String yearS = JOptionPane.showInputDialog(null, "Choose year registered: ");
				int yearI = Integer.parseInt(yearS);
				JOptionPane.showMessageDialog(null, "Expenses registered in desired month/year: \n");
				register.lerArquivoDespesas(monthInt, yearI);
				break;
			}


		} while (opInt != 7);
		System.out.println("quitting");
		register.getStudents().forEach(s -> System.out.println(s));
		register.getCategories().forEach(c -> System.out.println(c));
		register.getExpenses().forEach(e -> System.out.println(e));
		register.getSubCategories().forEach(sub -> System.out.println(sub));

		// register.removeStudent(student);

		
	}



}