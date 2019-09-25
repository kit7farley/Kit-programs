
       
         
        
       /******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kit 
   Date Due:   9/16/2019
 ******************************************************************************/
import java.util.Scanner;

public class closest
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
       int a;
       int b;
       int orig;
       int inal;

        System.out.println(" Give me a number");
        a= keyboard.nextInt();
        System.out.println("Give me another number"); 
        b= keyboard.nextInt();
         orig= a;
         inal=b;
        if (a < 0 )
        {
           a *= -1;

        }

        else if(b < 0)
        {
          b *= -1;

        }
        if ( a < b )  
        {
            System.out.println( orig + "is closest to 0"  );
        }
         else if (a > b )
         {
           System.out.println( inal + "is closest to 0"  );

         }

       
        
       
        
         
        

        

            
           
              
             
             

             


       
         
         

         
        
    }
}
 
     
