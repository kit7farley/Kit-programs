/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   8/20/2019
 ******************************************************************************/
import java.util.Scanner;

public class lowest
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
       int a;
       int b; 
        
System.out.println(" Give me two numbers and I will give you the lowest of the two!");

         System.out.println("please give me a number for a:") ;  
         a = keyboard.nextInt();   
         System.out.println("Please give me a second number for b:");
         b = keyboard.nextInt();

         if (a < b)
    {

          System.out.println(a);

    }
         
     else if ( a = b )
      {

        System.out.println("those are equal");  
      }   
     else if (b<a)

{
      System.out.println(b);

}
    
else
{
    System.out.println(" i have no idea how you did that");
}
}