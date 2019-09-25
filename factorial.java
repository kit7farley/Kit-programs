/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   8/20/2019
 ******************************************************************************/
import java.util.Scanner;

public class factorial
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
       int number;
       int factorial = 0;
       

       System.out.println("Give me a number and i will give you the factorial");  
       number= keyboard.nextInt();
      
   
      for ( int i=1; i <= number; i++ )
      {
       factorial *= i;
       
      }
      System.out.printf("The factorial of %d is %d",number,factorial);
      
    }
}