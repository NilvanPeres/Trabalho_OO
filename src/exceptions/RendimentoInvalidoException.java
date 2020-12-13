package exceptions;

 public class RendimentoInvalidoException extends Exception 
{
   
  
	private static final long serialVersionUID = 1L;

	public RendimentoInvalidoException(String errorMessage) 
    {
        super(errorMessage);
    }
}