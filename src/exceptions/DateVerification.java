package exceptions;

public class DateVerification {
	
	private int month, year;
	
	// construtor
	public DateVerification(int mes, int ano) {
		 
		if (month<=12 && month>0)
			month = mes;
		
		if (year<=2020 && year>2015)
			year = ano;
	}

}