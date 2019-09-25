
       
         
        
       /******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kit
   Date Due:   9/16/2019
 ******************************************************************************/
import java.util.Scanner;

public class week
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
       int day;

       System.out.println(" Give me a number 1-7 and I will tell you what day of the week that is");
        day= keyboard.nextInt();

        if (day ==1)
        {
            System.out.println("Today is Sunday");
        }
        else if (day == 2)
        {
            System.out.println(" Today is Monday :(");
        }
        else if (day == 3)
        {
            System.out.println("Today is Teusday");
        }
        else if (day ==4)
        {
            System.out.println("Today is Wednesday");
            
        }
        else if ( day==5)
        {
            System.out.println("Today is Thursday");
        }
        else if (day ==6)
        {
        System.out.println("Today is Friday:)");
        }
        else if (day == 7)
        {
            System.out.println("Today is Saturday");
        }
        if ( day > 1 && day < 7)
        {
          System.out.println("It is a Weekday");
        }
        else if (day == 1 || day == 7)
        {
            System.out.println(" It is a Weekend");
        }
        else
        {
            System.out.println(" Not a valid number");
        }
       
        
         
        

        

            
           
              
             
             

             


       
         
         

         
        
    }
}
 
     
