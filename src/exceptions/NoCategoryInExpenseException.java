package exceptions;

public class NoCategoryInExpenseException extends RuntimeException {
    
    public NoCategoryInExpenseException() {
        super();
    }
    
    public NoCategoryInExpenseException(String msg) {
        super(msg);
    }
}
