import java.util.Scanner;

public class EvenOddsolution {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println(" Enter a number : ");

        // Read the input number from the user
        int N =scanner.nextInt();


        // Check if the number is even or odd
        if ( N % 2 ==0 )
        System.out.println("The number " + N + " is even.");
        else
        System.out.println("The number " + N + " is odd.");

        // Close the scanner to release system resources
        scanner.close();
    }
}