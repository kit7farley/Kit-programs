     /******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kit
   Date Due:   9/16/2019
 ******************************************************************************/
import java.util.Scanner;

public class guessing2
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);

      int guess;
      int answer = 65;
      int count= 0;
      String again;

      do
      {

         System.out.println("Guess a number between 1- 10,000 and I will tell you if you guessed right or not ");
        guess = keyboard.nextInt();
 
        while ( guess != answer)
        {

      if ( guess < answer)
      {
          System.out.println("You guessed too low try again");
      }
         else  
         {
             System.out.println(" You guessed to high try again");
         }
            
             count++;

             System.out.println(" Guess again:");
             guess = keyboard.nextInt();
            
        }

            System.out.printf(" You got it good job! It took you %d tries\n" , count);

            if (count < 10)
            {
                System.out.println(" Wow you're pretty smart");
            }
            else if (count < 20)
            {
                System.out.println(" You're ok I guess");
            }
            else if ( count <50)
            {
                System.out.println(" You're just plain dumb");
            }
             else 
             {
                 System.out.println(" You are a loser!");
             }

             System.out.print(" Would you like to play again?? (yes/no):")
             again= keyboard.next();
    
        } while(again.equals("Yes"))
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}







