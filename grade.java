
       
         
        
       /******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kit 
   Date Due:   9/16/2019
 ******************************************************************************/
import java.util.Scanner;

public class grade
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
       int grade;
        System.out.println("-------------------------------------------------------------------------");
       System.out.println(" Give me a grade percentage and I will tell you if you got an A,B,C,D, or F ");
        System.out.println("-------------------------------------------------------------------------");
        grade= keyboard.nextInt();
         
        if (grade >= 90   )
        {
            System.out.println("You got an A Good Job!");
        }
        
         else if (grade >= 80)
        {
            System.out.println(" You got a B not to shabby");
        }
         else if (grade >=70)
        {
            System.out.println(" You got a C I think you could've done better");
        }
          else if ( grade >= 60 ) 
        {
            System.out.println(" You got a D You need to study better");
        }
         else 
        {
            System.out.println("You got an F You might need to consider a tutor");
        }
        System.out.println("Now that's the grade you got... enter the one you want. ");
        grade=keyboard.nextInt();
        System.out.println("That's much better if you study harder I know you'll get it!");
       
        
       
        
         
        

        

            
           
              
             
             

             


       
         
         

         
        
    }
}
 
     
