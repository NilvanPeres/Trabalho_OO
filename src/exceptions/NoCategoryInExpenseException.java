 /*
 * Trabalho de Orientacao a Objetos 
 * Feito por: Ana Julia 
 *            Davi Matheus
 *            Lais Portela
 *            Lucas Rodrigues
 *            Nilvan Junior
 */
package exceptions;

 public class NoCategoryInExpenseException extends Exception 
{
    public NoCategoryInExpenseException() 
    {
        super();
    }
    public NoCategoryInExpenseException(String errorMessage) 



{
        super(errorMessage);
    }
}