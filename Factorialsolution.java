import java.util.Scanner;

public class Factorialsolution {
    public static void main(String[] args) {
        int  n , fact = 1; 
        Scanner scanner = new Scanner(System.in);
       
        do{

            System.out.print("Enter a positive integer : ");
            n = scanner.nextInt();
            if(n> 0 ){
                //System.out.println(n);
                if ( n ==0 || n==1){
                    System.out.println(" The factorial de "  +  n + "is:  " + 1 );
             }
             else{
                 for(int i =2; i<=n;i++){
    
                  fact = fact *i ;
                 }
                 System.out.println(" The factorial of "  +  n + " is: " + fact );
             }
            }
            else{
                System.out.println("Error: Invalid input. Please enter a positive integer.");
    
            }
           
           

        }

        while (n <= 0);
        
       



    
        

        // Prompt the user to enter a number
        

        // Read the input number from the user
        //if (N >= 0)
    //     if (n >= 0){
       /*if ( n ==0 || n==1){
                System.out.println(" The factorial de "  +  n + "is:  " + 1 );
         }
         else{
             for(int i =2; i<=n;i++){

              fact = fact *i ;
             }
             System.out.println(" The factorial of "  +  n + " is: " + fact );
         }*/

    // }
          
    // else{

    
    // }
       scanner.close();

        
    }
    
}
