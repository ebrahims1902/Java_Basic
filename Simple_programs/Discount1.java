
package Calculate;

import java.util.Scanner;

public class Discount1 {

    public static void main(String[] args) 
    {
     Scanner scanner = new Scanner(System.in);
     System.out. println("Enter the total cost of the items purchased");
     int tc=scanner.nextInt();
     double amt, dis;
     if(tc<=2000)
     {
       dis=tc*0.00;
      }
      else if(tc>2000 && tc<=5000)
      {
        dis=tc*0.25;
       }
       else if(tc>5000)
       {
         dis=tc*0.35;
        }
        else  
        {
          dis=tc*0.35;
         }
         amt=tc-dis;
         System.out.println("The amount to be paid by the customer: "+amt);
       }
  }

    
    

