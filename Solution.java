import java.util.Scanner;

 class Solution {
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
    
            // Prompt the user to enter temperature in Celsius
            System.out.println("Enter temperature in Celsius");
            float C =scanner.nextFloat();

    
            // Convert Celsius to Fahrenheit using the conversion formula
            float F = C * 9/5 + 32 ;
    
            // Display the temperature in Fahrenheit
            System.out.println(C + " degrees Celsius is equal to " + F + " degrees Fahrenheit." );
    
            scanner.close();
        }
}