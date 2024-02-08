
import java.util.Scanner;
public class Exercice2 {

    public static void main(String[] args) {
        // Initialisation des variables
        double  n; // le nombre entree par l'utilisateur 

        int count = 0;
        //double nbr = Math.random();
        //int nbr = RandomNumber();
        int nbr = (int) (Math.random() * 999) ; // le nombre aleatoir 
        Scanner scanner = new Scanner(System.in);
       
        do{
            //Demander à l'utilisateur de deviner le nombre

            System.out.print("Enter a number between 0 and 999 : ");
            n = scanner.nextDouble();

            /*Si la tentative de l'utilisateur est supérieure au nombre aléatoire, le programme informe
                'utilisateur en imprimant "C'est moins."*/
            if(n > nbr  )
           
            {
                
                System.out.println(" It's  less . " );
            }
            /*Si la tentative de l'utilisateur est inférieure au nombre aléatoire, le programme informe
                l'utilisateur en imprimant "C'est plus."*/
            else if ( n < nbr )
                {
                   
                    System.out.println(" It's more . " );
             }
            else 
             { 
                //Si la tentative de l'utilisateur corresponde au nombre aléatoire.
                System.out.println("");
                System.out.println(" Congratulations , you guessed the number ");
             }
             // Incrémenter le compteur d'essais
              count++;
        }
        while (nbr != n); 


         // Afficher le nombre de iteration pour le résultat final
      // Afficher le résultat final

        System.out.println("");
    System.out.println("Resultat obtained in " + count + " attempt(s) ");
      
       scanner.close();

        
    
    
    }
     

    
}
