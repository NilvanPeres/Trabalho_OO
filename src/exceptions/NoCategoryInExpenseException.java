package exceptions;

public class NoCategoryInExpenseException extends RuntimeException {
    
    
	private static final long serialVersionUID = 1L;

	public NoCategoryInExpenseException(String msg) {
        super(msg);
    }
}
