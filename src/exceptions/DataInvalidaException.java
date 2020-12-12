package exceptions;

 public class DataInvalidaException extends Exception 
{
    public DataInvalidaException() 
    {
        super();
    }
    public DataInvalidaException(String errorMessage) 
    {
        super(errorMessage);
    }
}