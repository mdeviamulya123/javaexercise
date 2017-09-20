import java.util.Scanner;

class Sum{

public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int score = 0;
    int sum = 0;


    System.out.println("Enter numbers here");
    String line = kb.nextLine();


    


    kb = new Scanner(line); 
    while (kb.hasNextInt()) {
        score = kb.nextInt();
        sum += score;
    }
    System.out.println(sum);
}
}
