import java.util.Scanner;


public class TestArray {

   public static void main(String[] args) {

   	int i, l;
   //	String s;
   	 



   	

   	System.out.println("Enter your word ");
Scanner scanner = new Scanner(System.in);
String s= scanner.nextLine();
l= s.length();
char[] a=s.toCharArray(); 



for (i=0; i<l; i++)
{

	if( a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' ||  a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U' )
	 {
		System.out.println("Vowel"); }
     
    

		else {
		System.out.println("Consonant");	
		}

		

	}
}


}














