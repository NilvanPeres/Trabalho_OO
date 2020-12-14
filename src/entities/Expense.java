package entities;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Expense { 

	// Atributos
	private double account;     //valor da conta
	private int month;          // mes
	private Integer year;	        // ano
	private String description; //descricao da despesa
	private String mes;
	private String CategoryExpense;

	// Construtor
	public Expense(String description, double account, Integer monthInteger, Integer yearInteger, String CategoryExpense) {
		this.description = description;
		this.account = account;
		this.month = monthInteger;
		this.year = yearInteger; 	
		this.CategoryExpense = CategoryExpense;
	}

	//Arquivo Txt para Despesa
	public String despesaTxt(Integer month, Integer year){
		try {
			this.month = month;
			this.year = year;

			// Sequencia para nomear o nome do arquivo de acordo com o int digitado pelo user
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


			String fileName = "despesas_"+this.mes+"_"+this.year+".txt";


			FileWriter fw = new FileWriter(fileName, true);
			PrintWriter pw = new PrintWriter(fw);

			pw.println("Nome: " + this.description + ";  Valor: " + this.account + ";  Categoria:" + this.CategoryExpense); 
			pw.flush();
			pw.close();
			fw.close();	

		} catch (IOException ex) {

			ex.printStackTrace();
		}
		return "cadastrado com sucesso";
	}

	//Metodos gets e sets
	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}


	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Metodos da lista Expense
	public void addExpense(double account) { // adiciona despesa
		this.account += account;
	}

	public void removeExpense(double account) { //remove despesa
		this.account -= account;
	}

	@Override //polimorfismo para print
	public String toString() {
		return "nome: " + description + ", conta: R$ " + account + ", mês: " + month + ", ano: " + year +", categoria: " + CategoryExpense + "\n\n" ;
	}


}