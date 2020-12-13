 /*
 * Trabalho de Orientacao a Objetos 
 * Feito por: Ana Julia 
 *            Davi Matheus
 *            Lais Portela
 *            Lucas Rodrigues
 *            Nilvan Junior
 */
package exceptions;

 public class RendimentoInvalidoException extends Exception 
{
    public RendimentoInvalidoException() 
    {
        super();
    }
    public RendimentoInvalidoException(String errorMessage) 



{
        super(errorMessage);
    }
}