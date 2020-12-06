package exceptions;

public class NoCategoryFoundException  extends RuntimeException {
    public NoCategoryFoundException() {
        super();
    }
    
    public NoCategoryFoundException(String msg) {
        super(msg);
    }
}