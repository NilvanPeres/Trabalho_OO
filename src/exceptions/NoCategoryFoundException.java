package exceptions;

public class NoCategoryFoundException  extends RuntimeException {
    
	private static final long serialVersionUID = 1L;

	public NoCategoryFoundException(String msg) {
        super(msg);
    }
}