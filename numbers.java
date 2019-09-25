/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   8/20/2019
 ******************************************************************************/
import java.util.Scanner;

public class numbers
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
       int a;
       int b; 
       String icon;
        
         System.out.println("please give me a number:") ;  
         a = keyboard.nextInt();   
         System.out.print(" Type in an operator( +, -, *, / )");
         icon= keyboard.next();
         System.out.println("Please give me a second number:");
         b = keyboard.nextInt();
         
         if(icon.equals("+"))
         {
         System.out.printf("%d + %d = %d\n", a,b,a+b);

         }
          else if (icon.equals("-"))
          
          {
            System.out.printf("%d - %d = %d\n", a,b,a-b);
          }

          else if (icon.equals("*"))
          {

           System.out.printf("%d * %d = %d\n", a,b,a*b);
          }
          else if (icon.equals("/"))
          {
          System.out.printf("%d / %d = %d\n", a,b,a/b);

          }

          else 
          {
             System.out.println(" That is not possible");

          }



         
        

         

    }
}