
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