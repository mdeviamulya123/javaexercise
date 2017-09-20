import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class Prog {

    public static void main(String args[]){
       
        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();
       
        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }      
       
    }
 
    /*
     * Java method to check if number is palindrome or not
     */
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;
        int r,i, sum=0;

        int a[] = new int[number];

        while (palindrome != 0) {


      int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            
            while(number> 0)
            {
               
           r= number%10;
            
            
            if(r%2==0)
            {
                sum=sum+ r;
            }
            number= number/10;
            }
        System.out.println("Sum of even Digits:"+sum);
        return true;

        }
        return false;
    }

}

