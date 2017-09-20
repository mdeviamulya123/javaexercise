

import java.util.Scanner;
 
class OddOrEven
{
   public static void main(String args[])
   {
      int x;
      System.out.println("Enter an integer to check if it is odd or even ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
 
      if ( x % 2 == 0 && x<20 && x>30 )
         System.out.println("Jerry");
      else
         System.out.println("Tom");
   }
}