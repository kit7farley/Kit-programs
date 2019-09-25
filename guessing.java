/******************************************************************************
 CLASS INFORMATION                                   * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kit Farley
   Date Due:   9/11/2019            
 ******************************************************************************/
import java.util.Scanner;

public class guessing  
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
       int a;
       int b = 34;
       
         
        System.out.println("--------------------");
         System.out.println(" Guessing Game!");
        System.out.println("--------------------");
           System.out.println("Pick a number between 1-10,000 and see if you guess the right number:");  
         a = keyboard.nextInt();
         
        while(  a != b )
        {
        if (a<b)
        {
         System.out.println("Too Low... Try again you'll get it next time ");
        }
          
        else  
        {
        System.out.println("Too High... Keep going you've got this ");
        }
        a=keyboard.nextInt();
        
        
        
        }
        
         System.out.println("You guessed right, Good job!");
            
           
              
             
             

             


       
         
         

         
        
    }
}
 
     
