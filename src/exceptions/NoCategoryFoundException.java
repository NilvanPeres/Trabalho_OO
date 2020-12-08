
package exceptions;

public class NoCategoryFoundException extends RuntimeException { //RuntimeException - biblioteca de Java
    
	private static final long serialVersionUID = 1L;
	
	//Excecao para quando nao achar categoria
	public NoCategoryFoundException(String msg) {
        super(msg);
    }
}