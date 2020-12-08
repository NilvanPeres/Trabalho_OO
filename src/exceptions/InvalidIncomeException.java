
package exceptions;

// Excecao para quando o rendimento for inválido
 public class InvalidIncomeException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
    public InvalidIncomeException(String errorMessage) 
    {
        super(errorMessage);
    }
}