/**
 * Trabalho de Orientacao a Objetos 
 * Feito por: Ana Julia 
 *            Davi Matheus
 *            Lais Portela
 *            Lucas Rodrigues
 *            Nilvan Junior
 */
package exceptions;

public class DateVerification {
	
	private int month, year;
	
	// Construtor
	// Excecao para quando a data for invalida
	public DateVerification(int mes, int ano) {
		 
		if (month<=12 && month>0)
			month = mes;
		
		if (year<=2020 && year>2015)
			year = ano;
	}

}