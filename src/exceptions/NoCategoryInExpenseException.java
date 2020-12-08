/*
 * Trabalho de Orientacao a Objetos 
 * Feito por: Ana Julia 
 *            Davi Matheus
 *            Lais Portela
 *            Lucas Rodrigues
 *            Nilvan Junior
 */
package exceptions;

public class NoCategoryInExpenseException extends RuntimeException {
    
    
	private static final long serialVersionUID = 1L;

	// Excecao para quando nao houver despesa na categoria
	public NoCategoryInExpenseException(String msg) {
        super(msg);
    }
}
