package program;
import java.util.Random;
import java.util.Scanner;
public class Guessgame {
    public static void main(String[] args) {
    	 int randomNumber = generateRandomOddNumber();
         int numAttempts = 0;
         while (numAttempts < 3) {  
        	     	 Scanner scanner = new Scanner(System.in);
        	System.out.print("Guess the number between 0 to 999: ");
            int guess = scanner.nextInt();
            if (guess%2==0) {
                System.out.println("It is Even number..Pls enter odd number");
                   }  else if(guess>999) {   
            	 System.out.println("Invalid Number...pls enter valid odd number");
            }	else if(guess < randomNumber) {
                System.out.println("Low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("High! Try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
                break;
            }
                     numAttempts++;           }	} 
        public static int generateRandomOddNumber() {
        Random random = new Random();
        int randomNumber = 567;  //random.nextInt(300) * 2 + 1;  
        return randomNumber;  }}
