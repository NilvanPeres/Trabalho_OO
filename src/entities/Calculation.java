package entities;

import java.util.List;

public interface Calculation {
	
	Double calculateByProportion(List <Student> ls, List <Expense> le );
	Double calculate(List <Student> ls, List <Expense> le );

}
