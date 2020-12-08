/**
 * Trabalho de Orientacao a Objetos 
 * Feito por: Ana Julia 
 *            Davi Matheus
 *            Lais Portela
 *            Lucas Rodrigues
 *            Nilvan Junior
 */
package exceptions;

public class NoRegisterFoundException extends RuntimeException { //RuntimeException - biblioteca de Java
    
	private static final long serialVersionUID = 1L;
	
	//Excecao para quando nao achar categoria
	public NoRegisterFoundException(String msg) {
        super(msg);
    }
}