/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: kit farley
   Date Due:   9/20/2019
 ******************************************************************************/
import java.util.Scanner;

public class prime
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
       int num;
       boolean prime = true;

       System.out.println("Give me a number and I will tell you if that number is prime"); 
       num=keyboard.nextInt();

       for( int i = 2; i < num; i++  )
       {
           if ( num % i == 0 )
           {
               prime=false; 
           
           }
       }
          
          if ( prime)
          {
              System.out.println(" That is a prime number");
          }
            
         
          else
          {
              System.out.println(" That is not a prime number");
          }          
    
    }      
          

}         
           
