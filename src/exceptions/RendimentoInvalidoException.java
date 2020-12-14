
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