
/**
 * Trabalho de Orientacao a Objetos 
 * Feito por: Ana Julia 
 *            Davi Matheus
 *            Lais Portela
 *            Lucas Rodrigues
 *            Nilvan Junior
 */
package entities;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class Student {
	
	// atributos
	private String name; // nome do estudante
    private String email; // email do estudante
    private double income; // renda mensal do estudante
    
    // construtor da classe
    public Student(String name, String email, double income) {
		this.name = name;
		this.email = email;
		this.income = income;
	}
    
    
    public String alunoTxt(){
		try {
			
			FileWriter fw = new FileWriter("alunos.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("Nome: " + this.name + "; Email: " + this.email + "; Rendimento: " + this.income);
			pw.flush();
			pw.close();
			fw.close();
			
			
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return "cadastrado com sucesso";
	}
    
    
	// Metodos gets e sets
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	

	public double getIncome() {
		return income;
	}
	
	

	// Metodos da classe
	public void calculeIncome(double income) { // Calculo da renda mensal
    	this.income += income;
    }
	
	
	//Polimorfismo de email e nome
	@Override
	public int hashCode() { 
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode()); 
		long temp;
		temp = Double.doubleToLongBits(income);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	

	// Metodo de validação
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (Double.doubleToLongBits(income) != Double.doubleToLongBits(other.income))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	


	//Método toString
	public String toString2(){
		return "Name: "
		+ name
		+ "Email: "
		+ email
		+ "Income: "
		+ income;
		
	} 

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", income=" + income + "]";
	}
}